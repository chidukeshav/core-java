package CollectionAssignment;

import java.util.ArrayList;

public class Cloths {
	String cl_name;
	String cl_color;
	int cl_cost;
	public Cloths(String cl_name, String cl_color, int cl_cost) {
		super();
		this.cl_name = cl_name;
		this.cl_color = cl_color;
		this.cl_cost = cl_cost;
	}
	@Override
	public String toString() {
		return "Cloths [cl_name=" + cl_name + ", cl_color=" + cl_color + ", cl_cost=" + cl_cost + "]";
	}
	public static void main(String[] args) {
		ArrayList<Cloths>c1=new ArrayList<Cloths>();
		c1.add(new Cloths("Shirt","white",500));
		c1.add(new Cloths("pant","black",1500));
		for(int i = 0;i<c1.size();i++) {
			Object o1=c1.get(i);
			Cloths e1=(Cloths)o1;
			System.out.println(e1);
		}
	}
}
