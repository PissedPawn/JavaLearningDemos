package GameMarket;

public class CampaignManager {

	void add(Campaign campaign)
	{
		System.out.println(campaign.getName()+ " added to the system");
	}
	
	void update(Campaign campaign)
	{
		System.out.println(campaign.getName()+ " updated");
	}
	
	void delete(Campaign campaign)
	{
		System.out.println(campaign.getName()+ " deleted from the system");
	}
}
