
package collection;

import java.util.ArrayList;




public class Array_wraper_square{
	static void area(ArrayList l2) {
		for(int i=0;i<l2.size();i++) {
			int a =(int)l2.get(i);
			int res=a*a;
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
