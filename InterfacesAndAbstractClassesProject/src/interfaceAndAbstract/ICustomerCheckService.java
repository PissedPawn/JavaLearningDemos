package interfaceAndAbstract;

import java.rmi.RemoteException;

public interface ICustomerCheckService {

	boolean CheckIfReal(Customer customer) throws RemoteException;
}
