package GameMarket;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws RemoteException {

		Gamer gamer = new Gamer(0, "Vuqar", "Rahimli", 1998, 123456789);  // new user instance

		Product product = new Product(); // new product instance
		product.setName("Witcher 3");
		
		
		GamerManager manager = new GamerManager(new AGAServiceAdapter());// gamerManager accepting a validation service
		
		
		CampaignManager campaignManager = new CampaignManager(); // campaign manager instance
		manager.register(gamer);

		Campaign campaign = new Campaign("%50 discount on all products campaign"); // new campaign Instance
		campaignManager.add(campaign);
		campaignManager.update(campaign);
		

		SaleManager saleManager = new SaleManager(campaign); // sale manager instance

		saleManager.sell(product, gamer);
		
		saleManager.refund(product, gamer);
		
		
		campaignManager.delete(campaign);

		

	}

}
