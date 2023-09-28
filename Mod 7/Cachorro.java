
public class Cachorro {

	String nome;
	String porte;
	int idade;
	double peso;
	double altura; // Chama de altura, mas é o tamanho logo atrás do pescoço até o bumbum.
	double horasEx;

	// Abaixo do peso = abaixo de 18.5
	// Peso normal = entre 18.5 e 25
	// Acima do peso = Entre 25 e 30
	// Obeso = acima de 30.
	
	Cachorro(){} //Construtor default

	Cachorro(String nomeCachorro, String porteCachorro, int idadeCachorro, double pesoCachorro, double alturaCachorro,
			double horasExCachorro) {
		nome = nomeCachorro;
		porte = porteCachorro;
		peso = pesoCachorro;
		altura = alturaCachorro;
		horasEx = horasExCachorro;

	}


	double calcularIMCC() {
		double imcc = peso / (Math.pow(altura, 2));
		return imcc;
	}

	// Porte pequeno >> 1hora ou menos =100 a 620 calorias, Entre 1 e 2 horas =125 e
	// 700 kcal, mais de 3hrs= 150 e 840

	// Porte médio >> 1 hora ou menos =620 a 1230 kcal, Entre 1 e 2 horas = 700 a
	// 1400 calorias, mais de 3hrs= 840 e 1680 calorias

	// Porte grande >> 1 hora ou menos =1230 kcal, Entre 1 e 2 horas = 1400
	// calorias, mais de 3hrs= 1680 calorias

	void CaloriasPorDia() {
		//pequeno
		
		if(porte == "Pequeno" && horasEx <= 1) {
			System.out.println("Seu cachorro tem que consumir de 100 a 620 calorias por dia.");
		}
		else if(porte == "Pequeno" && horasEx > 1 && horasEx <= 2.9) {
			System.out.println("Seu cachorro tem que consumir de 125 a 700 calorias por dia.");
		}
		else if (porte == "Pequeno" && horasEx > 3 ) {
			System.out.println("Seu cachorro tem que consumir de 150 a 840 calorias por dia.");
		}
		
		//médio
		
		else if (porte == "Médio" && horasEx <= 1) {
			System.out.println("Seu cachorro tem que consumir de 620 a 1230 calorias por dia.");
		}
		else if (porte == "Médio" && horasEx > 1 && horasEx <= 2.9) {
			System.out.println("Seu cachorro tem que consumir de 700 a 1400 calorias por dia.");
		}
		else if(porte == "Médio" && horasEx > 3 ) {
			System.out.println("Seu cachorro tem que consumir de 840 a 1680 calorias por dia.");
		}
		

		//grande
		
		else if (porte == "Grande" && horasEx <= 1) {
			System.out.println("Seu cachorro tem que consumir de 1230 calorias por dia.");
		}
		else if (porte == "Grande" && horasEx > 1 && horasEx <= 2.9) {
			System.out.println("Seu cachorro tem que consumir de 1400 calorias por dia.");
		}
		else if(porte == "Grande" && horasEx > 3 ) {
			System.out.println("Seu cachorro tem que consumir de 1680 calorias por dia.");
		}
		
		// Quando n é nenhum nem outro
		else if (porte != "Pequeno" || porte != "Grande" || porte != "Médio") {
			System.out.println("Não foi reconhecido nenhum tipo de porte. Por favor, tente novamente.");
		}
    }
}
