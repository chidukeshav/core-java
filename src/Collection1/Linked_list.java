package Collection1;

import java.util.LinkedList;

public class Linked_list {
	public static void main(String[] args) {
		LinkedList l1= new LinkedList();
		l1.add(10);
		l1.add(10.5);
		l1.add("hello");
		l1.add(true);
		l1.add("null");
		System.out.println(l1);
//		l1.remove(2);
//		System.out.println(l1);
//		l1.remove(true);
//		System.out.println(l1);
//		
//		System.out.println(l1.size());
//		l1.clear();
//		System.out.println(l1);
//		System.out.println(l1.isEmpty());
//		System.out.println(l1.contains("hello"));
//		System.out.println(l1.get(3));
//		l1.set(3,"Hi");
//		System.out.println(l1);
		
//		System.out.println(l1.capacity());
		
		LinkedList l2 = new LinkedList();
		l2.add(20);
		l2.add("hello");
		l2.add(10.5);
		l2.add('B');
		l2.add(true);
//		System.out.println(l2);
//		System.out.println(l1);
//		l1.addAll(2,l2);
//		System.out.println(l1);
//		l1.retainAll(l2);
//		System.out.println(l1);
		l1.removeAll(l2);
		System.out.println(l1);
		
		
	}

}
