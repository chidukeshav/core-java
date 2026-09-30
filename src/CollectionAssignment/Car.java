package CollectionAssignment;

import java.util.ArrayList;

public class Car {
	String ca_name;
	int ca_cost;
	String ca_color;
	
	public Car(String ca_name, int ca_cost, String ca_color) {
		
		this.ca_name = ca_name;
		this.ca_cost = ca_cost;
		this.ca_color = ca_color;
	}
	
	@Override
	public String toString() {
		return "Car [ca_name=" + ca_name + ", ca_cost=" + ca_cost + ", ca_color=" + ca_color + "]";
	}

	public static void main(String[] args) {
		ArrayList<Car>c1=new ArrayList<Car>();
		c1.add(new Car("Seltos",33578,"white"));
		c1.add(new Car("aulto",33578,"red"));
		c1.add(new Car("omni",33578,"blue"));
		for(int i=0;i<c1.size();i++) {
			Object o1=c1.get(i);
			Car i1=(Car)o1;
			System.out.println(i1);
		}
	}
}
