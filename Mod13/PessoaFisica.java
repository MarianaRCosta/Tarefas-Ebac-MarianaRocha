package Exercicio13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PessoaFisica extends Pessoa{

	String cpf;
	String profissao;
	String bens;
	
	public void imprimirCPF() {
		System.out.println("O CPF de " + this.nome + " é " + this.cpf);
	}
	
	public void imprimirProfissao() {
		System.out.println(this.nome + " é um(a) " + this.profissao);
	}
	
	public void votar() {
		if(idade < 18) {
			System.out.println(this.nome + " não pode votar");
		}
		
		else {
			System.out.println(this.nome + " pode Votar");
		}
	                     }
	
	public void bens(){
		String[] Usuario = bens.split(" , ");
		List<String> listaDeBens = new ArrayList<>();
		
		for (String a1: Usuario) {
		    listaDeBens.add(a1);
		}
		Collections.sort(listaDeBens);
		System.out.println(this.nome + " tem esses pertences: " + listaDeBens);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getBens() {
		return bens;
	}

	public void setBens(String bens) {
		this.bens = bens;
	}
	
	
}
