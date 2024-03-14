package Factory;

public class Car {

	private int horsePower;
	private String fuelSource;
	private String color;
	
	public Car(int horsePower, String fuelSource, String color) {
		this.horsePower = horsePower;
		this.fuelSource = fuelSource;
		this.color = color;
	}
	
	public void startEngine() {
		System.out.println(getClass().getSimpleName());
		System.out.println("O motor à " + fuelSource + " deu ignição e está pronto para ser usado. " + horsePower + " horsepower.n");
	}
	public void clean() {
		System.out.println("O carro foi limpo, e a cor " + color.toLowerCase() + " brilha!");
	}
	public void mechanicCheck() {
		System.out.println("O carro foi olhado pelo mecânico. Tudo parece bom!");
	}
	public void fuelCar() {
		System.out.println("O carro está cheio de " + fuelSource.toLowerCase());
	}
}
