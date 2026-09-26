package collection;

import java.util.Vector;

public class Vector_rectangle {

	static void area(Vector v3,Vector v4) {
		for(int i =0;i<v3.size();i++) {
			int l=(int)v3.get(i);
			int b=(int)v4.get(i);
			System.out.println(l*b);
			

			
		}
	}
	public static void main(String[] args) {
		Vector v1= new Vector();
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(40);
		Vector v2= new Vector();
		v2.add(10);
		v2.add(20);
		v2.add(30);
		v2.add(40);
		area(v1,v2);
		
	}
	
}
