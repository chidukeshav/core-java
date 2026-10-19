package DesignPattern;

import java.util.LinkedHashSet;

public class Iterator {
	public static void main(String[] args) {
		LinkedHashSet l1 = new LinkedHashSet();
		l1.add(10);
		l1.add(20.25);
		l1.add("Hi");
		l1.add(true);

		java.util.Iterator itr = l1.iterator();
		while (itr.hasNext()) {
			Object o1 = itr.next();
			System.out.println(o1);
		}
	}
}