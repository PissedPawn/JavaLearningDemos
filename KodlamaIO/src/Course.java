
public class Course {
	// Field

	private String CourseName;
	
	private String CourseDetail;
	
	private int CourseLengthHours;
	
	

	private int Progress;    /// Commit Changes
	
	private CourseInstructor Instructor;
	/////////////////////////////////////////////
	
	//Constructor
	
	
	public Course(String name, String detail, int length, int progress, CourseInstructor instructor)
	{
		CourseName=name;
		CourseDetail=detail;
		CourseLengthHours= length;
		Progress=progress;
		Instructor= instructor;
	}
	
	
	public Course() {}
	/////////////////////////////////////////////
	
	//Getters & Setters
	public String getCourseName() {
		return CourseName;
	}


	public void setCourseName(String courseName) {
		CourseName = courseName;
	}


	public String getCourseDetail() {
		return CourseDetail;
	}


	public void setCourseDetail(String courseDetail) {
		CourseDetail = courseDetail;
	}


	public int getCourseLengthHours() {
		return CourseLengthHours;
	}


	public void setCourseLengthHours(int courseLengthHours) {
		CourseLengthHours = courseLengthHours;
	}


	public int getProgress() {
		return Progress;
	}


	public void setProgress(int progress) {
		Progress = progress;
	}


	public CourseInstructor getInstructor() {
		return Instructor;
	}


	public void setInstructor(CourseInstructor instructor) {
		Instructor = instructor;
	}
	
	//////////////////////////////////////////////////////////////////////

}
