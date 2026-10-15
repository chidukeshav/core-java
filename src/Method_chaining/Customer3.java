package Method_chaining;

class Amazon {
	void shoe() {
		System.out.println("white shoe");
	}
}

class Shop {
	Amazon manufacture() {
		Amazon a1 = new Amazon();
		return a1;
	}
}

class DeliveryBoy {
	Shop Delivery() {
		Shop s1 = new Shop();
		return s1;

	}
}

public class Customer3 {
	public static void main(String[] args) {
		new DeliveryBoy().Delivery().manufacture().shoe();
	}

}
