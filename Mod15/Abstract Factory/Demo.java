package Factory;

public class Demo {

	public static void main(String[] args) {
		Customer cliente = new Customer("A", false);
		Factory factory = getFactory(cliente);
		Car car = factory.create(cliente.getGradeRequest());
		car.startEngine();
		
		System.out.println(" ");
		
		Customer cliente1 = new Customer("B", true);
		Factory factory1 = getFactory(cliente1);
		Car car1 = factory1.create(cliente1.getGradeRequest());
		car1.clean();
		car1.startEngine();
		
		System.out.println(" ");
		
		Customer cliente2 = new Customer("C", false);
		Factory factory2 = getFactory(cliente2);
		Car car2 = factory2.create(cliente2.getGradeRequest());
		car2.startEngine();
	}

	private static Factory getFactory(Customer cliente) {
		if(cliente.hasCompanyContract()) {
			return new ContractFactory();
		}else {
			return new NoContractFactory();
		}
		
	}
}
