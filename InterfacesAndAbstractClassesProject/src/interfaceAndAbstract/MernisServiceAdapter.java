package interfaceAndAbstract;





//import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean CheckIfReal(Customer customer) {

		//KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();

		//boolean result = kpsPublic.TCKimlikNoDogrula(customer.getIdentityNo(),
		//		customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getYearOfBirth());
		
		

		//if (result)
		//	return true;
		//else

			return false;
	}

}
