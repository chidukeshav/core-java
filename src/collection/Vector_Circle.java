package collection;

import java.util.Vector;

public class Vector_Circle {
	static void area(Vector v2) {
		for(int i=0;i<v2.size();i++) {
			int r=(int)v2.get(i);
			double pi=3.142;
			System.out.println(pi*r*r);
		}
	}
	public static void main(String[] args) {
		Vector v1= new Vector();
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(40);
		
		area(v1);
	}

}
