package Exercicio13;

public class PessoaJuridica extends Pessoa{

	String cnpj;
	String empresa;
	
	public void imprimirEmpresa() {
		System.out.println(this.nome + " tem a empresa de: " + this.empresa);
		System.out.println("Essa empresa tem o CNPJ de: " + this.cnpj);
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String snpj) {
		this.cnpj = snpj;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	
}
