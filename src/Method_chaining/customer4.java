package Method_chaining;

class Zepto {
	void food() {
		System.out.println("Biryani");
	}
}

class Meghanas {
	Zepto Biryani() {
		Zepto z = new Zepto();
		return z;
	}
}

class Deliverydelivery {
	Meghanas Delivery() {
		Meghanas m1 = new Meghanas();
		return m1;

	}
}

public class customer4 {
	public static void main(String[] args) {
		new Deliverydelivery().Delivery().Biryani().food();
	}
}
