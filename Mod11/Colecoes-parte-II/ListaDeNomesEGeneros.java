package ExercMod11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListaDeNomesEGeneros {

	public static void main(String[] args) {
		listaUsuariosFemininos();	
		listaUsuariosMaculinos();
	}
	
	private static void listaUsuariosFemininos(){
		System.out.println("*****Lista de usuários femininos*****");
		
		List<Usuario> list = new ArrayList<Usuario>();
		
		Usuario aF = new Usuario ("Joana da Silva","Feminino");
		Usuario bF = new Usuario ("Claudia Maria dos Santos", "Feminino");
		Usuario cF = new Usuario ("Sophia Machado", "Feminino");
		
		list.add(aF);
		list.add(bF);
		list.add(cF);
		
		Collections.sort(list);
		System.out.println(list);
		System.out.println(" ");
	
	}
	
	private static void listaUsuariosMaculinos() {
		System.out.println("*****Lista de usuários Masculinos*****");
		
		List<Usuario> list = new ArrayList<Usuario>();
		
		Usuario aM = new Usuario ("Matheus José", "Masculino");
		Usuario bM = new Usuario ("Homero Barros", "Masculino");
		Usuario cM = new Usuario ("Rodrigo De Cantra", "Masculino");
		
		list.add(aM);
		list.add(bM);
		list.add(cM);
		
		Collections.sort(list);
		System.out.println(list);
		System.out.println(" ");
	
	}
	
}
