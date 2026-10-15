package Method_chaining;

class Car_factory {
	void manufacture() {
		System.out.println("Seltos");
	}
}

class Car_manufacture {
	Car_factory manuf() {
		Car_factory c1 = new Car_factory();
		return c1;

	}
}

class Showroom {
	Car_manufacture hassan() {
		Car_manufacture cm = new Car_manufacture();
		return cm;
	}
}

public class Customer {
	public static void main(String[] args) {
		new Showroom().hassan().manuf().manufacture();
	}

}
