package Assignment3;

import java.time.LocalDate;
import java.time.Period;

public class EmployeeService {
	String name;
	double salary;
	LocalDate hireDate;

	public EmployeeService(String name, int salary, LocalDate hireDate) {
		this.name = name;
		this.salary = salary;
		this.hireDate = hireDate;
	}

	public static void main(String[] args) {
		EmployeeService e1 = new EmployeeService("Mounika", 80000, LocalDate.of(2020, 02, 20));

		e1.experience();
		System.out.print(e1.name + " " + e1.salary);

	}

	public void experience() {
		System.out.println("Experience:"+Period.between(hireDate, LocalDate.now()).getYears()+"years");

	}

}
