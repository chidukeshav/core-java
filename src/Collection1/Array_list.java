package Collection1;

import java.util.ArrayList;

public class Array_list {
	public static void main(String[] args) {
		ArrayList l1 =new ArrayList();
		l1.add(10);
		l1.add(10.6);
		l1.add("Hi");
		l1.add(true);
		l1.add(50);
		System.out.println(l1);
		ArrayList l2 =new ArrayList();
		l2.add(20);
		l2.add(10.6);
		l2.add("Hello");
		l2.add(false);
		l2.add(100);
		System.out.println(l2);
		
//		System.out.println(l1);
//		System.out.println(l1.size());
//		System.out.println(l1.get(2));
//		System.out.println(l1.contains("Hi"));
//		//l1.clear();
//		System.out.println(l1.isEmpty());
//		//l1.remove(2);
		//l1.remove(true);
//		l1.addAll(l2);
//		System.out.println(l1);
		l1.addAll(2,l2);
		System.out.println(l1);
		
	}
}
