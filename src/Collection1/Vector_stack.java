package Collection1;

import java.util.Stack;

public class Vector_stack {
	public static void main(String[] args) {
		Stack p1 = new Stack();
		p1.add(10);
		p1.add(20.5);
		p1.add("hi");
		p1.add('a');
		p1.add(true);
		System.out.println(p1);
		Stack p2 = new Stack();
		p2.add(20.5);
		p2.add(10);
		p2.add(10);
		p2.add("hello");
		p2.add('a');
		p2.add(false);
		p2.add(0, "na");
		p2.add(null);
		System.out.println(p2);
		
//		System.out.println(p1.get(2));
//		System.out.println(p1.set(0, 100));
//		System.out.println(p1);
		
		
//		p1.push(50);
//		System.out.println(p1);
//		p1.pop();
//		System.out.println(p1);
		
//		p1.addAll(p2);
//		p1.addAll(2, p2);
//		System.out.println(p1);
		
//		p1.removeAll(p2);
//		System.out.println(p1);
		
//		p1.retainAll(p2);
//		System.out.println(p1);
		
//		p1.remove(1);
//		System.out.println(p1);
//		p1.remove(true);
//		System.out.println(p1);
		
//		System.out.println(p1.isEmpty());
//		System.out.println(p1.contains(10));
//		System.out.println(p1.capacity());
		
		
//		p1.clear();
//		System.out.println(p1.size());

//		System.out.println(p1.peek());

	}
}
