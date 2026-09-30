package CollectionAssignment;

import java.util.ArrayList;

public class Laptop {
 String lap_name;
 String lap_color;
 int lap_cost;
 public Laptop(String lap_name, String lap_color, int lap_cost) {
	
	this.lap_name = lap_name;
	this.lap_color = lap_color;
	this.lap_cost = lap_cost;
 }
 @Override
 public String toString() {
	return "Laptop [lap_name=" + lap_name + ", lap_color=" + lap_color + ", lap_cost=" + lap_cost + "]";
 }
 public static void main(String[] args) {
	ArrayList<Laptop>a1=new ArrayList<Laptop>();
	a1.add(new Laptop("HP","White",5676));
	a1.add(new Laptop("Redme","blue",5676));
	for(int i = 0;i<a1.size();i++) {
		Object o1=a1.get(i);
		Laptop e1=(Laptop)o1;
		System.out.println(e1);
	}
}
}
