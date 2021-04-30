
public class Main {

	public static void main(String[] args) {
		
		Student student= new Student(1, "Vuqar", "Rahimli"); // student 
		
		Instructor instructor = new Instructor(1, "Engin", "Demirog"); // instructor
		
		StudentManager studentManager= new StudentManager(); // student Manager
		InstructorManager instructorManager= new InstructorManager(); // instructor manager
		
	
		RegistrationManager instructorRegister=  new RegistrationManager(instructorManager); 
		RegistrationManager studentRegister=  new RegistrationManager(studentManager); 
		// registration manager accepting a user manager as parameter
		
	
		// registration
		
		instructorRegister.Register();
		studentRegister.Register();
		
		// Enroll in a course
		
		studentManager.Enroll(student);
		
		// add a new course
		instructorManager.AddCourse(instructor);
		
		// log in log out
		
		studentManager.LogIn(student);
		studentManager.LogOut(student);
		
		instructorManager.LogIn(instructor);
		instructorManager.LogOut(instructor);
		

		
		
		
		
		
		
		
		
		
		
		
		

	}
	

}
