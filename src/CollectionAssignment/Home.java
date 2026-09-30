package CollectionAssignment;

import java.util.ArrayList;

public class Home {
	String h_name;
	String h_color;
	int h_cost;
	public Home(String h_name, String h_color, int h_cost) {
		super();
		this.h_name = h_name;
		this.h_color = h_color;
		this.h_cost = h_cost;
	}
	@Override
	public String toString() {
		return "Home [h_name=" + h_name + ", h_color=" + h_color + ", h_cost=" + h_cost + "]";
	}
	public static void main(String[] args) {
		ArrayList<Home>h1=new ArrayList<Home>();
		h1.add(new Home("ramram","white",66565));
		h1.add(new Home("seeta","red",66565));
		for(int i = 0;i<h1.size();i++) {
			Object o1=h1.get(i);
			Home e1=(Home)o1;
			System.out.println(e1);
		}
	}
			
}
