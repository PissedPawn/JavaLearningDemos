package interfaceAndAbstract;

public class StarbucksCustomerManager extends BaseCustomerManager{


	ICustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
	}
	
	
	@Override
	public void Register(Customer customer) {
		
		if(customerCheckService.CheckIfReal(customer))
		super.Register(customer);
		
		else
			System.out.println("Values are not correct.");
		
	}

}
