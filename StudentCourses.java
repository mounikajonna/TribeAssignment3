package Assignment3;

public class StudentCourses {
	String name;
	char grade;
	String[] courses;

	public StudentCourses(String name, char grade) {
		this.name = name;
		this.grade = grade;
	}

	public void AddCourses(String[] courses) {
		this.courses = courses;

	}

	public void removeCourses(StudentCourses s1, String coursesRemove) {
		String[] newCourses = new String[s1.courses.length];
		int count = 0;
		for (int i = 0; i < s1.courses.length; i++) {
			if (s1.courses[i].equalsIgnoreCase(coursesRemove)) {
				continue;
			} else {
				newCourses[count] = s1.courses[i];
				count++;
			}
		}
		s1.courses = newCourses;
	}

	public static void main(String[] args) {

		StudentCourses s2 = new StudentCourses("Madhu", 'A');
		String[] newCourses = { "Java", "HTML", "CSS", "NodeJS" };
		s2.AddCourses(newCourses);

		System.out.println("name : " + s2.name + " , grade : " + s2.grade);
		for (int i = 0; i < s2.courses.length; i++) {
			System.out.println(" courses : " + s2.courses[i]);
		}
		System.out.println("After removal");
		s2.removeCourses(s2, "NodeJS");
		for (int i = 0; i < s2.courses.length; i++) {
			System.out.println("New courses : " + s2.courses[i]);
		}

	}

}
