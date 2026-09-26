package Collection1;

import java.util.TreeSet;

public class Set_TreeSet {
	public static void main(String[] args) {
		TreeSet h1 = new TreeSet();
		h1.add("Hello");
		h1.add("hello");
		h1.add("Bye");
		h1.add("bye");
		System.out.println(h1);

		TreeSet h2 = new TreeSet();
		h2.add("Hello");
		h2.add("Kai");
		h2.add("Bye");
		h2.add("Thai");
//		h2.add(null); not possible
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
