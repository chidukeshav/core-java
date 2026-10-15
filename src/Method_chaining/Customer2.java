package Method_chaining;

class Flipcart {
	void shoe() {
		System.out.println("Black shoe");
	}
}

class Newshop {
	Flipcart manufacture() {
		Flipcart a1 = new Flipcart();
		return a1;
	}
}

class Ekart {
	Shop Delivery() {
		Shop s1 = new Shop();
		return s1;

	}
}

public class Customer2 {
	public static void main(String[] args) {
		new Ekart().Delivery().manufacture().shoe();
	}

}