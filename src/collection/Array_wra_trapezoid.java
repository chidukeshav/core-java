package collection;

import java.util.ArrayList;

public class Array_wra_trapezoid {
	static void area(ArrayList l4,ArrayList l5,ArrayList l6) {
		for(int i=0;i<l4.size();i++) {
			int a =(int)l4.get(i);
			int b =(int)l5.get(i);
			int h =(int)l6.get(i);
			double res=0.5*(a+b)*h;
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
			ArrayList l3= new ArrayList ();
			l3.add(10);
			l3.add(20);
			area(l1,l2,l3);
			
	
	}

}


