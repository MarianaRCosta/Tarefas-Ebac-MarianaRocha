package TarefaMod12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaDeNomesParteDois {
	
	public static void main(String[] args) {
		listaDeNomes();

	}
	
	private static void listaDeNomes() {
		String Pessoas = "Joana -F, Paulo -M, Alícia -F, Jerfeson -M, Matheus -M, Bruno -M, Amanda -F, Helena -F, Yuri -M";
		String[] Usuario = Pessoas.split(", ");
		List<String> lista = new ArrayList<>();
		for (String a1: Usuario) {
		    lista.add(a1);
		}
		Collections.sort(lista);
		System.out.println("Lista completa: " + lista);
		System.out.println(" ");
		
		List<String> listaFeminina = new ArrayList<>();
		List<String> listaMasculina = new ArrayList<>();
		
		for(String lista1 : lista) {
			if(lista1.contains("-F")) {
				listaFeminina.add(lista1);
			}
			
			else if(lista1.contains("-M")) {
				listaMasculina.add(lista1);
			}
		}
		
		Collections.sort(listaFeminina);
		Collections.sort(listaMasculina);
		
		System.out.println("Lista Feminina:" + listaFeminina);
		System.out.println("Lista Masculina:" + listaMasculina);
		

	}

}
