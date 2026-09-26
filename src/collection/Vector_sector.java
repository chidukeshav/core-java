package collection;

import java.util.Vector;

public class Vector_sector {
	static void area(Vector v2) {
		for(int i=0;i<v2.size();i++) {
			int t=(int)v2.get(i);
			double pi =3.142;
			int r=(int)v2.get(i);
			System.out.println(t*pi*r*r);
			
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
