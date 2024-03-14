package Factory;

public class ContractFactory extends Factory {

	@Override
	Car retrieveCar(String requestedGrade) {
		if("A".equals(requestedGrade)) {
			return new CorolaCar(100,"gasolina","preta");
		}
			
		else if("B".equals(requestedGrade)) {
			return new CivicCar(400, "gasolina", "branca");
			}
		
		else {
			System.out.println("Infelizmente o carro requerido não se encontra disponível.");
			return null;
		}
	}
}
