package Assignment3;

public class CourseDetails {
	String courseName;
	String instructor;
	int credits;

	public CourseDetails(String courseName, String instructor, int credits) {
	        this.courseName = courseName;
	        this.instructor = instructor;
	        this.credits = credits;
	    }

	public void displayCourseDetails() {
		System.out.println("Course Name: " + courseName);
		System.out.println("Instructor: " + instructor);
		System.out.println("Credits: " + credits);
	}
}

class OnlineCourse extends CourseDetails{
	String platform;
	int duration;

	public OnlineCourse(String courseName, String instructor, int credits, String platform, int duration) {
		super(courseName, instructor, credits);
		this.platform = platform;
		this.duration = duration;
	}

	public void displayCourseDetails() {
		super.displayCourseDetails();
		System.out.println("Platform: " + platform);
		System.out.println("Duration: " + duration + " hours");
	}

	public boolean isEligibleForCertificate() {
		return duration >= 20;
	}

	public static void main(String[] args) {
		OnlineCourse onlineCourse = new OnlineCourse("Java Full Stack", "Mounika", 8, "St.tribe", 12);

		System.out.println("Course Details:");
		onlineCourse.displayCourseDetails();

		if (onlineCourse.isEligibleForCertificate()) {
			System.out.println("\nThe course is eligible for a certificate.");
		} else {
			System.out.println("\nThe course is not eligible for a certificate.");
		}
	}
}
