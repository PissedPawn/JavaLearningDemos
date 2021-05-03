package GameMarket;



import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;



public class MernisServiceAdapter extends BaseValidationManager {

	@Override
	public boolean checkIfUserIsReal(Gamer gamer) throws RemoteException{

		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();

		boolean result = kpsPublic.TCKimlikNoDogrula(gamer.getIdentityNo(), gamer.getFirstName().toUpperCase(),
				gamer.getLastName().toUpperCase(), gamer.getYearOfBirth());

		if (result)
			return true;
		else
			return false;
	}

}
