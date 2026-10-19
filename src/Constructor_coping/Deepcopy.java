package Constructor_coping;

class Add1 {
	String ad;

	public Add1(String ad) {
		this.ad = ad;
	}
}

public class Deepcopy {
	String n;
	int id;
	Add1 a1;

//Constructor
	public Deepcopy(String n, int id, Add1 a1) {
		this.n = n;
		this.id = id;
		this.a1 = a1;
	}

//Copy Constructor
	public Deepcopy(Deepcopy s1) {
		this.n = s1.n;
		this.id = s1.id;
		this.a1 = new Add1(s1.a1.ad);
	}

	@Override
	public String toString() {
		return n + " " + id + " " + a1.ad;
	}

	public static void main(String[] args) {
		Add1 a = new Add1("London");
		Deepcopy n = new Deepcopy("bob", 12, a);
		System.out.println(n);
		Deepcopy n1 = new Deepcopy(n);
		System.out.println(n1);
		System.out.println("---------");
		n1.a1.ad = "Bengaluru";
		System.out.println(n);
		System.out.println(n1);
	}
}