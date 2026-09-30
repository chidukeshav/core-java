package CollectionAssignment;

import java.util.ArrayList;

public class Bike {
	String bi_name;
	int bi_cost;
	String bi_color;
	public Bike(String bi_name, int bi_cost, String bi_color) {
		
		this.bi_name = bi_name;
		this.bi_cost = bi_cost;
		this.bi_color = bi_color;
	}
	@Override
	public String toString() {
		return "Bike [bi_name=" + bi_name + ", bi_cost=" + bi_cost + ", bi_color=" + bi_color + "]";
	}
	public static void main(String[] args) {
		ArrayList<Bike>b1=new ArrayList<Bike>();
		b1.add(new Bike("RE",33578,"white"));
		b1.add(new Bike("FZ",33578,"red"));
		b1.add(new Bike("MT",33578,"blue"));
		for(int i=0;i<b1.size();i++) {
			Object o1=b1.get(i);
			Bike i1=(Bike)o1;
			System.out.println(i1);
		}
	}
}
