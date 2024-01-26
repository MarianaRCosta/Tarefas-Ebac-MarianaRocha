package Exercicio13;

public class Programa {

	public static void main(String args[]) {
		PessoaFisica Rodrigo = new PessoaFisica();
		Rodrigo.setNome("Matheus");
		Rodrigo.setSobrenome("Silva");
		Rodrigo.setIdade(27);
		Rodrigo.setGenero("Masculino");
		Rodrigo.setBens("Computador , Mouse , Caderno , Pendrive , Teclado , Caderneta , swicth");
		Rodrigo.setProfissao("Engenheiro Mecânico");
		Rodrigo.setCpf("233");
		Rodrigo.imprimirNomeSobrenome();
		Rodrigo.imprimirProfissao();
		Rodrigo.imprimirCPF();
		Rodrigo.comer();
		Rodrigo.exercicio();
		Rodrigo.votar();
		Rodrigo.bens();
		
		System.out.println(" ");
		
		PessoaFisica Mariana = new PessoaFisica();
		Mariana.setNome("Mariana");
		Mariana.setSobrenome("Rocha");
		Mariana.setIdade(26);
		Mariana.setGenero("Feminino");
		Mariana.setBens("Bichinho de pelúcia , Estojo , Mangás , Computador , Mouse , Caderno , Pendrive , Teclado");
		Mariana.setProfissao("Arquiteta");
		Mariana.setCpf("854");
		Mariana.imprimirNomeSobrenome();
		Mariana.imprimirProfissao();
		Mariana.imprimirCPF();
		Mariana.comer();
		Mariana.exercicio();
		Mariana.votar();
		Mariana.bens();
		
		System.out.println(" ");
		
		PessoaFisica AnaLuiza = new PessoaFisica();
		AnaLuiza.setNome("Ana Luiza");
		AnaLuiza.setSobrenome("Aragão");
		AnaLuiza.setIdade(7);
		AnaLuiza.setGenero("Feminino");
		AnaLuiza.setBens("Bichinho de pelúcia , Estojo , brinquedos , Livros , Tamagochi , Barbie , Carrinhos ");
		AnaLuiza.setProfissao("Estudante do fundamental");
		AnaLuiza.setCpf("152");
		AnaLuiza.imprimirNomeSobrenome();
		AnaLuiza.imprimirProfissao();
		AnaLuiza.imprimirCPF();
		AnaLuiza.comer();
		AnaLuiza.votar();
		AnaLuiza.bens();
		
		System.out.println();
		
		PessoaJuridica Joao = new PessoaJuridica();
		Joao.setNome("João");
		Joao.setSobrenome("da Silva");
		Joao.setIdade(26);
		Joao.setGenero("Masculino");
		Joao.setCnpj("548666");
		Joao.setEmpresa("Italec");
		Joao.imprimirEmpresa();
		
		System.out.println(" ");
		PessoaJuridica Aline = new PessoaJuridica();
		Aline.setNome("Aline");
		Aline.setSobrenome("Herculano");
		Aline.setIdade(29);
		Aline.setGenero("Feminino");
		Aline.setCnpj("478411");
		Aline.setEmpresa("JoySmile");
		Aline.imprimirEmpresa();
	}
}
