package Assignment3;

public class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println(name + " " + age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Mounika", 22);
		Person p2 = new Person("Madhuri", 20);
		
	}

}
