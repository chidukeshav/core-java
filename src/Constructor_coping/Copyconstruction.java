package Constructor_coping;

//Shallow Copy

public class Copyconstruction {
	String n;
	int id;

//Constructor
	public Copyconstruction(String n, int id) {
		this.n = n;
		this.id = id;

	}

//Copy Constructor
	public Copyconstruction(Copyconstruction s1) {
		this.n = s1.n;
		this.id = s1.id;

	}

	@Override
	public String toString() {
		return n + " " + id;
	}

	public static void main(String[] args) {
		Copyconstruction n = new Copyconstruction("bob", 12);
		System.out.println(n);
		Copyconstruction n1 = new Copyconstruction(n);
		System.out.println(n1);
	}
}