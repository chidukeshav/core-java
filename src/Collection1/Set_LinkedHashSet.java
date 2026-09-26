package Collection1;

import java.util.LinkedHashSet;

public class Set_LinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet h1 = new LinkedHashSet();
		h1.add(10);
		h1.add(20.5);
		h1.add("hello");
		h1.add('a');
		h1.add(true);
		h1.add(10);
		h1.add(null);
		System.out.println(h1);

		LinkedHashSet h2 = new LinkedHashSet();
		h2.add(10);
		h2.add(30.5);
		h2.add("kelo");
		h2.add('a');
		h2.add(false);
		h2.add(10);
		h2.add(null);
		System.out.println(h2);
		
//		h1.addAll(h2);
//		System.out.println(h1);
		
//		h1.retainAll(h2);
//		System.out.println(h1);
		
//		h1.removeAll(h2);
//		System.out.println(h1);
		
//		System.out.println(h1.size());
//		h1.clear();
//		System.out.println(h1.size());
//		h1.remove(10);
//		System.out.println(h1);
//		System.out.println(h1.contains(10));
//		System.out.println(h1.isEmpty());
		

	}
}
