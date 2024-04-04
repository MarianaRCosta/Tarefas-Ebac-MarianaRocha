package GenericsExercicio;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ListaDeCarro <T>{

	public static void main(String[] args) {
		ArrayList<Carro> carros = new ArrayList<>();
		
		Honda Accord = new Honda("Accord", "Honda", "Cinza", 2024);
		Honda City = new Honda("City", "Honda", "Azul", 2020);
		Volkswagen Polo = new Volkswagen("Polo", "Volkswagen", "Branco", 2019);
		Volkswagen Jetta = new Volkswagen("Jetta", "Volkswagen", "Vermelho", 2022);
		
		carros.add(Accord);
		carros.add(City);
		carros.add(Polo);
		carros.add(Jetta);
		
		System.out.println(Arrays.asList(Accord));
		System.out.println(Arrays.asList(City));
		System.out.println(Arrays.asList(Polo));
		System.out.println(Arrays.asList(Jetta));
	
	
	}	
}
