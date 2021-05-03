package GameMarket;

public class SaleManager {

	


	private Campaign campaign;
	
	public SaleManager(Campaign campaign) {
		
		this.campaign = campaign;
	}
	
	
	void sell(Product product, Gamer gamer)
	{
		System.out.println(product.getName()+ " is sold to " +gamer.getFirstName()+ " with " + campaign.getName());
	}
	
	
	void refund(Product product, Gamer gamer)
	{
		System.out.println(gamer.getFirstName()+ " refunded " + product.getName());
	}
}
