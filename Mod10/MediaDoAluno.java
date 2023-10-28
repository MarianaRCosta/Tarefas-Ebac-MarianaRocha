package Aulas;

import java.util.Scanner;

public class MediaDoAluno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digita as notas do aluno ao longo do ano:");
		
		double notaUm = sc.nextDouble();
		double notaDois = sc.nextDouble();
		double notaTres = sc.nextDouble();
		double notaQuatro = sc.nextDouble();
		
		double media = (notaUm + notaDois + notaTres + notaQuatro)/4;
		
		if(media >= 7 && media <=10) 
		{
		System.out.println("Aluno aprovado.");	
		}
		
		else if(media < 7 && media >=5) {
			System.out.println("Aluno foi encaminhado para recuperação");
		}
		
		else if(media < 5 && media >= 0) {
			System.out.println("Aluno reprovado.");
		}
		
		else {
			System.out.println("Algo deu errado. \nVerifique se as notas foram adicionadas corretamente.");
		}
		

	}

}
