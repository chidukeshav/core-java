package ConstructorChaining;

//betweentheclass 2
class demo1 {
	public demo1() {
		System.out.println("Details");
	}
}

public class Employee1 extends demo1 {
	String name;
	String company;
	String dept;

	public Employee1(String name) {
		this(name, "VTU");
	}

	public Employee1(String name, String company) {
		this(name, company, "CSE");
	}

	public Employee1(String name, String company, String dept) {
		super();
		this.name = name;
		this.company = company;
		this.dept = dept;
	}

	public static void main(String[] args) {
		Employee1 s1 = new Employee1("chhidu");
		System.out.println(s1.name + " " + s1.company + " " + s1.dept);
	}
}