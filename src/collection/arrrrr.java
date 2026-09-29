package collection;

import java.util.ArrayList;

public class arrrrr {
	static void area(ArrayList l3,ArrayList l4) {
		for(int i=0;i<l3.size();i++) {
			int h =(int)l3.get(i);
			int w =(int)l4.get(i);
			int res=w*h;
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


