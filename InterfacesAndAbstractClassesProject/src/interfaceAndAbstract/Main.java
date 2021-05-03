package interfaceAndAbstract;

public class Main {

	public static void main(String[] args) {
		
		
		BaseCustomerManager customerManager= new StarbucksCustomerManager(new MernisServiceAdapter());
		
		customerManager.Register(new Customer(0, "Vuqar", "Rahimli", 1998, 123456789));
		

	}

}
