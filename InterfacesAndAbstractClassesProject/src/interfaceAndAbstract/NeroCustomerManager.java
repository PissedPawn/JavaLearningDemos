package interfaceAndAbstract;

public class NeroCustomerManager extends BaseCustomerManager {

	@Override
	public void Register(Customer customer) {
		System.out.println(customer.getFirstName()+ " registered");
		
	}

}
