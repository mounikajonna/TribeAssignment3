package Assignment3;

public class Employee {
	String name;
	String jobtitle;
	double salary;

	public Employee(String name, String jobtitle, double salary) {
		this.name = name;
		this.jobtitle=jobtitle;
		this.salary=salary;
	}

	public double calculateAnnualSalary() {
		return salary * 12;
	}

	public void updateSalary(double newSalary) {
		if (newSalary > 0) {
			salary = newSalary;
			System.out.println("Salary updated: " + salary);
		} else {
			System.out.println("Update failed");
		}
	}
	 public void displayEmployeeDetails() {
		 System.out.println("Name: " + name);
		 System.out.println("Job Title: " + jobtitle);
	        System.out.println("Monthly Salary: " + salary);
	        System.out.println("Annual Salary: " + calculateAnnualSalary());
	 }
	 
	public static void main(String[] args) {
		Employee emp = new Employee("Mounika","Software Engineer",40000);
		emp.displayEmployeeDetails();
		emp.updateSalary(+5000);
		
	}
}

