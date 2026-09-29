package collection;

import java.util.ArrayList;

public class Array_wra_ellipse {
	static void area(ArrayList l3,ArrayList l4) {
		for(int i=0;i<l3.size();i++) {
			int a =(int)l3.get(i);
			int b =(int)l4.get(i);
			double pi=3.14;
			double res=pi*a*b;
			System.out.println(res);
		}
	}
	public static void main(String[] args) {
		
			ArrayList l1= new ArrayList ();
			l1.add(10);
			l1.add(20);
			ArrayList l2= new ArrayList ();
			l2.add(10);
			l2.add(20);
			area(l1,l2);
			
	
	}

}


