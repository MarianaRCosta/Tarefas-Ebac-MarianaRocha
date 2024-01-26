package Exercicio13;

public class Pessoa {

	String nome;
	String sobrenome;
	String genero;
	int idade;
	
	public void comer() {
	System.out.println(nome + " " + sobrenome + " está com fome");
	System.out.println("Então ela vai comer");
	}
	
	public void imprimirNomeSobrenome() {
		System.out.println("O nome é: " + this.nome);
		System.out.println("Seu sobrenome é " + this.sobrenome);
	}
	
	public void exercicio() {
		System.out.println(nome + " vai se exercitar");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	
	
}
