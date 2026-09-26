package collection;

import java.util.Vector;

public class Vector_trapezoid {
	static void area(Vector v2) {
		for(int i=0;i<v2.size();i++) {
			int a=(int)v2.get(i);
			int b=(int)v2.get(i);
			int h=(int)v2.get(i);
			System.out.println(0.5*(a+b)*h);
			
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
