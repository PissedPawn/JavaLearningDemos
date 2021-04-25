
public class CourseManager {

	public void Enroll(Course course) {
		System.out.println("Enrolled in : " + course.getCourseName());

		System.out.println("Your Instructor is : " + course.getInstructor().Name);

		System.out.println("Good Luck");
	}

	public void ReturnCourse(Course course) {
		System.out.println("You returned : " + course.getCourseName());
		
		System.out.println("Your Instructor was : " + course.getInstructor().Name);

		System.out.println("Good Luck In Your Learning Loop");
	}
}
