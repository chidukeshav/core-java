package DesignPattern;



interface Car{
	void manufacture();
}

class Swift implements Car{
	public void manufacture() {
		System.out.println("Ur swift is Ready");
	}
}

class Arena implements Car{
	public void manufacture() {
		System.out.println("Ur Arena is Ready");
	}
}

class Carfactory{
	static Car carmanufacture(String carname) {
		if(carname.equals("swift")) {
			return new Swift();
		}if(carname.equals("arena")) {
			return new Arena();
		}
		return null;
	}
}



public class Factory {
public static void main(String[] args) {
	Car c1 = Carfactory.carmanufacture("arena");
	c1.manufacture();
}
}