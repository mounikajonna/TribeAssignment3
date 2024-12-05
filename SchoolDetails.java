package Assignment3;

public class SchoolDetails {
	String name;
	String[] students;
	String[] teachers;
	String[] classes;
	int studentCount;
	int teacherCount;
	int classCount;

	public SchoolDetails(String name, int maxStudents, int maxTeachers, int maxClasses) {
		        this.name = name;
		        this.students = new String[maxStudents];
		        this.teachers = new String[maxTeachers];
		        this.classes = new String[maxClasses];
		        this.studentCount = 0;
		        this.teacherCount = 0;
		        this.classCount = 0;
		    }

	public void addStudent(String student) {
		if (studentCount < students.length) {
			students[studentCount++] = student;
			System.out.println("Student added: " + student);
		} else {
			System.out.println("No more space to add students.");
		}
	}

	public void removeStudent(String student) {
		int index = findIndex(students, student, studentCount);
		if (index != -1) {
			shiftLeft(students, index, studentCount);
			studentCount--;
			System.out.println("Student removed: " + student);
		} else {
			System.out.println("Student not found: " + student);
		}
	}

	public void addTeacher(String teacher) {
		if (teacherCount < teachers.length) {
			teachers[teacherCount++] = teacher;
			System.out.println("Teacher added: " + teacher);
		} else {
			System.out.println("No more space to add teachers.");
		}
	}

	public void removeTeacher(String teacher) {
		int index = findIndex(teachers, teacher, teacherCount);
		if (index != -1) {
			shiftLeft(teachers, index, teacherCount);
			teacherCount--;
			System.out.println("Teacher removed: " + teacher);
		} else {
			System.out.println("Teacher not found: " + teacher);
		}
	}

	public void createClass(String className) {
		if (classCount < classes.length) {
			classes[classCount++] = className;
			System.out.println("Class created: " + className);
		} else {
			System.out.println("No more space to create classes.");
		}
	}

	private int findIndex(String[] array, String value, int count) {
		for (int i = 0; i < count; i++) {
			if (array[i].equals(value)) {
				return i;
			}
		}
		return -1;
	}

	private void shiftLeft(String[] array, int index, int count) {
		for (int i = index; i < count - 1; i++) {
			array[i] = array[i + 1];
		}
		array[count - 1] = null;
	}

	public void displayDetails() {
		System.out.println("School Name: " + name);
		System.out.print("Students: ");
		displayArray(students, studentCount);
		System.out.print("Teachers: ");
		displayArray(teachers, teacherCount);
		System.out.print("Classes: ");
		displayArray(classes, classCount);
	}

	private void displayArray(String[] array, int count) {
		for (int i = 0; i < count; i++) {
			System.out.print(array[i] + (i < count - 1 ? ", " : ""));
		}
		System.out.println();
	}

	public static void main(String[] args) {
		SchoolDetails s = new SchoolDetails("Student Tribe", 3, 3, 3);
		s.addStudent("Mounika");
		s.addStudent("Madhu");
		s.removeStudent("Mamatha");
		s.addTeacher("Janu");
		s.addTeacher("Ramya");
		s.removeTeacher("Sai");
		s.createClass("Batch-1");
		s.createClass("Batch-2");
		s.displayDetails();
	}
}

