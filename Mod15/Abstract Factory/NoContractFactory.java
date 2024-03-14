package Factory;

public class NoContractFactory extends Factory{

	@Override
	Car retrieveCar(String requestedGrade) {
		if("A".equals(requestedGrade)) {
			return new Brasilia(100, "gasolina", "azul");
		}
		
		else if("B".equals(requestedGrade)) {
			return new Chevette (200, "etanol", "vermelho");
		}
		
		else {
			System.out.println("Infelizmente o carro requerido não se encontra disponível.");
			return null;
		}
	}

}
