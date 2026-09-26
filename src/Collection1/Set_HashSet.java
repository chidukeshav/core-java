package Collection1;

import java.util.HashSet;
import java.util.TreeSet;

public class Set_HashSet {
public static void main(String[] args) {
	HashSet h1= new HashSet();
	h1.add(10);
	h1.add(20);
	h1.add(30);
	h1.add(60);
	h1.add(50);
	h1.add(null);
	System.out.println(h1);
	HashSet h2 = new HashSet();
	h2.add("Hello");
	h2.add("Kai");
	h2.add("Bye");
	h2.add("Thai");
//	h2.add(null); not possible
	System.out.println(h2);
	
//	h1.addAll(h2);
//	System.out.println(h1);
	
//	h1.retainAll(h2);
//	System.out.println(h1);
	
//	h1.removeAll(h2);
//	System.out.println(h1);
	
//	System.out.println(h1.size());
//	h1.clear();
//	System.out.println(h1.size());
//	h1.remove(10);
//	System.out.println(h1);
//	System.out.println(h1.contains(10));
//	System.out.println(h1.isEmpty());
	
}
}
