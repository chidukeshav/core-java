package collection;

import java.util.Vector;

public class Vector_parallagorm {
	static void area(Vector v2) {
		for(int i=0;i<v2.size();i++) {
			int b=(int)v2.get(i);
			int w=(int)v2.get(i);
			System.out.println(b*w);
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
