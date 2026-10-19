package ConstructorChaining;

//Withinclass 2

public class Employee {
	String name;
	String company;
	String dept;

	public Employee(String name) {
		this(name, "VTU");
	}

	public Employee(String name, String company) {
		this(name, company, "CSE");
	}

	public Employee(String name, String company, String dept) {
		this.name = name;
		this.company = company;
		this.dept = dept;
	}

	public static void main(String[] args) {
		Employee s1 = new Employee("chidu");
		System.out.println(s1.name + " " + s1.company + " " + s1.dept);
	}
}