package collection;

import java.util.Vector;

public class Vector_square {
	static void area(Vector v3) {
		for(int i=0;i<v3.size();i++) {
			int r=(int)v3.get(i);
			System.out.println(r*r);
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
