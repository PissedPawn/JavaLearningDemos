package interfaceAndAbstract;

public class NewIdentityCheckServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean CheckIfReal(Customer customer) {
	if(customer.getFirstName()=="Vuqar"&&
			customer.getLastName()=="Rahimli"&&
			customer.getYearOfBirth()==1998&&
			customer.getIdentityNo()==123456789)
		return true;
	else 
		return false;
	}

}
