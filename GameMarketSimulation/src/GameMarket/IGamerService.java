package GameMarket;

import java.rmi.RemoteException;

public interface IGamerService {

	void register(Gamer gamer) throws RemoteException;
	
	void update(Gamer gamer);
	
	void delete(Gamer gamer);
}
