
public class RegistrationManager {

	private UserManager userManager;
	
	public RegistrationManager(UserManager userManager)
	{
		this.userManager= userManager;
	}
	
	
	
	
	
	public void Register()
	{
		
		userManager.SignUp();
		System.out.println("Added to the System");
	}
	
	
}
