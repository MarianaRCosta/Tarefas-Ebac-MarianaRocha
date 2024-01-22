package TarefaMod12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaDeNomes {

	public static void main(String[] args) {
		listaDeNomes();

	}
	private static void listaDeNomes() {
		String Pessoas = "Joana , Paulo , Alícia , Jerfeson , Matheus , Bruno , Amanda , Helena , Yuri";
		String[] Usuario = Pessoas.split(" , ");
				
		for(String a : Usuario) {
			System.out.println(a);
		}
		System.out.println("**** ListaOrdenada ****");
		List<String> lista = new ArrayList<>();
		for (String a1: Usuario) {
		    lista.add(a1);
		}
		Collections.sort(lista);
		
		for(String a2 : lista) {
			System.out.println(a2);
			
		}
		
		
	}

}
