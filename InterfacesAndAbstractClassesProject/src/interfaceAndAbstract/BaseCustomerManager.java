package interfaceAndAbstract;

public abstract class BaseCustomerManager implements ICustomerService {

	@Override
	public void Register(Customer customer) {
		System.out.println(customer.getFirstName() + " Saved to Database");

	}

}
