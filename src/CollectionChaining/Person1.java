package CollectionChaining;

//betweentheclass 3
class demo2 {
	public demo2() {
		System.out.println("Details");
	}
}

public class Person1 extends demo2 {
	String name;
	String c_code;
	String country;

	public Person1(String name) {
		this(name, "+91");
	}

	public Person1(String name, String c_code) {
		this(name, c_code, "India");
	}

	public Person1(String name, String c_code, String country) {
		this.name = name;
		this.c_code = c_code;
		this.country = country;
	}

	public static void main(String[] args) {
		Person1 s1 = new Person1("chidu");
		System.out.println(s1.name + " " + s1.c_code + " " + s1.country);
	}
}