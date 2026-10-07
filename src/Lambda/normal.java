package Lambda;


interface Circle{
	void area();
}

public class normal {
	public static void main(String[] args) {
		Circle c = ()->{
			int r = 5;
			double pi = 3.14;
			System.out.println(pi*r*r);
		};
		c.area();
	}

	

}
