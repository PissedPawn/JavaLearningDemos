package interfaceAndAbstract;

import java.rmi.RemoteException;

public class StarbucksCustomerManager extends BaseCustomerManager{


	ICustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
	}
	
	
	@Override
	public void Register(Customer customer)  {
		
		try {
			if(customerCheckService.CheckIfReal(customer))
			super.Register(customer);
			
			else
				System.out.println("Values are not correct.");
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
