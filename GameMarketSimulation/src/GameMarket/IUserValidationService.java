package GameMarket;

import java.rmi.RemoteException;

public interface IUserValidationService {

	boolean checkIfUserIsReal(Gamer gamer) throws RemoteException;
}
