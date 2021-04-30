
public class StudentManager extends UserManager{

	public void LogIn( Student user)
	{
		System.out.println(user.getName()+ " Logged in");
	}
	
	public void LogOut( Student user)
	{
		System.out.println(user.getName()+" Logged out");
	}
	
	public void SignUp()
	{
		System.out.println("New Student Registered");
	}
	
	public void Enroll(Student user)
	{
		System.out.println( user.getName()+" Enrolled in new course");
	}
}
