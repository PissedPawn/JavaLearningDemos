package GameMarket;

import java.rmi.RemoteException;

public abstract class BaseValidationManager implements IUserValidationService {

	@Override
	public abstract boolean checkIfUserIsReal(Gamer gamer) throws RemoteException;
		
	

}
