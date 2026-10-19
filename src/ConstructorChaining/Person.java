package ConstructorChaining;

//Withinclass 3

public class Person {
	String name;
	String c_code;
	String country;

	public Person(String name) {
		this(name, "+91");
	}

	public Person(String name, String c_code) {
		this(name, c_code, "India");
	}

	public Person(String name, String c_code, String country) {
		this.name = name;
		this.c_code = c_code;
		this.country = country;
	}

	public static void main(String[] args) {
		Person s1 = new Person("chidu");
		System.out.println(s1.name + " " + s1.c_code + " " + s1.country);
	}
}