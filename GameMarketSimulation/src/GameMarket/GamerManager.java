package GameMarket;

import java.rmi.RemoteException;

public class GamerManager implements IGamerService {
	
	


	IUserValidationService validationService;
	
	public GamerManager(IUserValidationService validationService) {
		
		this.validationService = validationService;
	}
	

	@Override
	public void register (Gamer gamer) throws RemoteException {
		
		if(validationService.checkIfUserIsReal(gamer))
		System.out.println(gamer.getFirstName() + " registered");
		
		else
			System.out.println("I see wrong people");
		
	}

	@Override
	public void update(Gamer gamer) {
		// TODO Auto-generated method stub
		System.out.println(gamer.getFirstName() + " updated");
	}

	@Override
	public void delete(Gamer gamer) {
		// TODO Auto-generated method stub
		System.out.println(gamer.getFirstName() + " deleted");
	}

}
