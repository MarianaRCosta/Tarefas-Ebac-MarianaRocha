package ExercMod11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListaDeNomesEGeneros {

	public static void main(String[] args) {
		listaUsuarios();	
		
	}
	
	private static void listaUsuarios(){
		System.out.println("*****Lista de usuários*****");
		

		Usuario a = new Usuario ("Joana da Silva","Feminino");
		Usuario b = new Usuario ("Matheus José", "Masculino");
		Usuario c = new Usuario ("Claudia Maria dos Santos", "Feminino");
		Usuario d = new Usuario ("Sophia Machado", "Feminino");
		Usuario e = new Usuario ("Rafael Barros", "Masculino");
		Usuario f = new Usuario ("Lucas De Cantra", "Masculino");
		
				
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		usuarios.add(a);
		usuarios.add(b);
		usuarios.add(c);
		usuarios.add(d);
		usuarios.add(e);
		usuarios.add(f);
		
		System.out.println("Lista de usuários totais: " + usuarios);
	
		List<Usuario> homens = new ArrayList<Usuario>();
		List<Usuario> mulheres = new ArrayList<Usuario>();
				
		for(Usuario usuario : usuarios) {
			if(usuario.getGenero().equals("Masculino")) {
				homens.add(usuario);
			}
			
			else {
				mulheres.add(usuario);
			}
		}
		
		System.out.println(" ");
		System.out.println("Lista de mulheres");
		System.out.println(mulheres);
		System.out.println("Lista de homens");
		System.out.println(homens);
	
	}
	
}
