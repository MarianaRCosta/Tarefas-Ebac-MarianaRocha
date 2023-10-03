import java.util.Scanner;

public class CalculoDeMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double nota3 = sc.nextDouble();
		double nota4 = sc.nextDouble();
		
		
		double calculoMedia = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.println("Sua média é: " + calculoMedia);

		if (calculoMedia >= 7 && calculoMedia <= 10) {
			System.out.println("Aprovado.");
		}

		else if (calculoMedia <= 6.9 && calculoMedia >= 4) {
			System.out.println("Reprovado. Aluno irá para recuperação.");
		}

		else if (calculoMedia < 4 && calculoMedia > 0) {
			System.out.println("Reprovado.");
		}
		
		else {
			System.out.println("Média não foi calculada corretamente.");
			System.out.println("Por favor, verifique se as notas inseridas estão corretas.");
		}

	}

}
