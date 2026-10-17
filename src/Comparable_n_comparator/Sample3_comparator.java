package Comparable_n_comparator;

//Comparator
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person {
	String n;
	int id;

	public Person(String n, int id) {
		this.n = n;
		this.id = id;
	}

	@Override
	public String toString() {
		return id + " " + n;
	}
}

class SortById4 implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return o1.id - o2.id;
	}

}

class SortByName4 implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return o1.n.compareTo(o2.n);
	}

}

public class Sample3_comparator {
	public static void main(String[] args) {
		ArrayList<Person> l = new ArrayList<>();
		l.add(new Person("Alex", 5));
		l.add(new Person("Bob", 1));
		l.add(new Person("Chidu", 4));
		l.add(new Person("Dinuu", 3));
		l.add(new Person("karthi", 2));
//	System.out.println(l);
//	Collections.sort(l,new SortById4());
		Collections.sort(l, new SortByName4());
		for (Person x : l) {
			System.out.println(x.id + " " + x.n);
		}
	}
}