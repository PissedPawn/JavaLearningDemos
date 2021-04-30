
public class InstructorManager extends UserManager{

	
	public void LogIn(Instructor user)
	{
		System.out.println(user.getName() + " Logged in");
	}
	
	public void LogOut(Instructor user)
	{
		System.out.println(user.getName() + " Logged out");
	}
	public void SignUp()
	{
		System.out.println("New Instructor Registered");
	}
	
	

	public void AddCourse(User user)
	{
		System.out.println(user.getName()+ " added a new Course");
	}
	
}
