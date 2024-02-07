package DomainAula;

import javax.swing.JOptionPane;

import dao.ClienteMapDAO;
import dao.IClienteDAO;

public class App {
	
	private static IClienteDAO iClienteDAO;

	public static void main(String args[]) {
	
		iClienteDAO = new ClienteMapDAO();
		/*
		 * "JOption" is a class library that makes it easy to pop up 
		 * a simple dialog box that either provides an information 
		 * message or asks for a simple input from the user
		 */
		String opcao = JOptionPane.showInputDialog(null,
				//Passar uma mensagem
				"Digite 1 para cadastro, 2 para consulta, 3 para exclusão, 4 para alteração ou 5 para sair." ,
				//Título e tipo de parametro
				"Cadastro" , JOptionPane.INFORMATION_MESSAGE);
		
		while(!isOpcaoValida(opcao)) {
			if("".equals(opcao)) {
				sair();
			}
			opcao = JOptionPane.showInputDialog(null, "Opção inválida! Digite 1 para cadastro, 2 para consulta, 3 para exclusão, 4 para alteração ou 5 para sair.",
					"Green dinner", JOptionPane.INFORMATION_MESSAGE);
		}
		
		while(isOpcaoValida(opcao)) {
			if(isOpcaoSair(opcao)) {
				sair();
			}
			else if(isCadastrado(opcao)) {
				String dados = JOptionPane.showInputDialog(null, 
						"Digite os dados do cliente separados por vírgula, conforme exemplo: Nome, CPF, Telefone, Endereço, Número, Cidade e Estado"
						,"Cadastro", JOptionPane.INFORMATION_MESSAGE);
				cadastrar(dados);
			}else if(isConsultar(opcao)) {
				String dados = JOptionPane.showInputDialog(null,
						"Digite o cpf",
						"Cadastro", JOptionPane.INFORMATION_MESSAGE);
				
				consultar(dados);
			}
			
			opcao = JOptionPane.showInputDialog(null,
					"Digite 1 para cadastro, 2 para consulta, 3 para exclusão, 4 para alteração ou 5 para sair.",
					"Green dinner", JOptionPane.INFORMATION_MESSAGE);
		}
  }
	
	

	private static void consultar(String dados) {
       if(!dados.matches("[0-9]+")) {
    	   JOptionPane.showMessageDialog(null, "A informação não é válida para o CPF", "Erro", JOptionPane.INFORMATION_MESSAGE);
       }
       else {
    	   Cliente cliente = iClienteDAO.consultar(Long.parseLong(dados));
           if (cliente != null) {
               JOptionPane.showMessageDialog(null, "Cliente encontrado: " + cliente.toString(), "Sucesso",JOptionPane.INFORMATION_MESSAGE);
           } else {
               JOptionPane.showMessageDialog(null, "Cliente não encontrado: ", "Erro",JOptionPane.INFORMATION_MESSAGE);
           }
       }
        
    }



	private static boolean isConsultar(String opcao) {
		if("2".equals(opcao)) {
			return true;
		}
		return false;
	}



	private static void cadastrar(String dados) {
		String[] dadosSeparados = dados.split(",");
		//Nome, CPF, Telefone, Endereço, Número, Cidade e Estado
		if(dadosSeparados.length != 7) {
			JOptionPane.showConfirmDialog(null, "Houve um erro! Verifique se todas as informações foram devidamente colocadas" , "Erro", JOptionPane.INFORMATION_MESSAGE);
			sair();
		}else {
			
		Cliente cliente = new Cliente(dadosSeparados[0],dadosSeparados[1],dadosSeparados[2],dadosSeparados[3],dadosSeparados[4],dadosSeparados[5],dadosSeparados[6]);
			Boolean isCadastrado = iClienteDAO.cadastrar(cliente);
			if(isCadastrado) {
				JOptionPane.showConfirmDialog(null, "Cliente cadastrado com sucesso" , "Sucesso", JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showConfirmDialog(null, "Cliente já se encontra cadastrado" , "Erro", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		
	}

	private static boolean isCadastrado(String opcao) {
		if("1".equals(opcao)) {
			return true;
		}
		return false;
	}

	private static boolean isOpcaoSair(String opcao) {
		if("5".equals(opcao)) {
			return true;
		}
		return false;
	}

	private static void sair() {
		JOptionPane.showMessageDialog(null,"Até logo: ", "Sair" , JOptionPane.INFORMATION_MESSAGE);
		
	}

	private static boolean isOpcaoValida(String opcao) {
		if("1".equals(opcao) || "2".equals(opcao) || "3".equals(opcao) || 
				"4".equals(opcao) || "5".equals(opcao)) {
			return true;
		}
		return false;
	}
}
