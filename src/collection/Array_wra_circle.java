package collection;

import java.util.ArrayList;

public class Array_wra_circle {
	static void area(ArrayList l2)
	{
		for(int i=0;i<l2.size();i++) {
			int r=(int)l2.get(i);
			double pi=3.14;
			double res=pi*r*r;
			System.out.println(res);
		}
	}
	public static void main(String[] args) {
		ArrayList l1= new ArrayList ();
		l1.add(10);
		l1.add(20);
		area(l1);
	}

}
