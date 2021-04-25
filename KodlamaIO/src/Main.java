
public class Main {

	public static void main(String[] args) {

		CourseInstructor instructor1 = new CourseInstructor(1, "Engin", " Amazing") {
		}; // Course Instructor Instance

		CourseInstructor instructor2 = new CourseInstructor(2, "Kerem", " Amazing") {
		}; // Course Instructor Instance

		Course course1 = new Course("Java & React", "Zero to Advanced", 27, 0, instructor1) {
		}; // Course Instance by constructor

		Course course2 = new Course(); // Course Instance by setter

		course2.setCourseName("C# & Angular");
		course2.setCourseDetail("Zero to Advanced");
		course2.setCourseLengthHours(30);
		course2.setInstructor(instructor2);

		// Course[] courses = new Course[] { course1, course2 };

		// CourseInstructor[] instructors = new CourseInstructor[] { instructor1,
		// instructor2 };

		CourseManager courseManager = new CourseManager();

		courseManager.Enroll(course1);

		courseManager.ReturnCourse(course2);

	}
	
	
}


