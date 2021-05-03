package GameMarket;

public class AGAServiceAdapter extends BaseValidationManager {

	@Override
	public boolean checkIfUserIsReal(Gamer gamer) {
		if (gamer.getFirstName() == "Vuqar" && gamer.getLastName() == "Rahimli" && gamer.getYearOfBirth() == 1998
				&& gamer.getIdentityNo() == 123456789)
			return true;
		else
			return false;
	}

}
