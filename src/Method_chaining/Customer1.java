package Method_chaining;

class Swiggy
{
	void order() {
		System.out.println("Biryani");
	}
}
class Hotel{
	Swiggy HNonveg() {
		Swiggy s1=new Swiggy();
		return HNonveg();
		
	}
}
class Delivery{
	Hotel DeliveryBoy() {
		Hotel h1=new Hotel();
		return h1;
	}
}
public class Customer1 {
	public static void main(String[] args) {
//		Delivery dd= new Delivery();
//		Hotel hh= dd.DeliveryBoy();
//		Swiggy ss=hh.HNonveg();
//		ss.order();
		new Delivery().DeliveryBoy().HNonveg().order();
	}

}
