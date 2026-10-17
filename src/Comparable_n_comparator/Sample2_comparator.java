package Comparable_n_comparator;

//Comparator
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Customer {
	String n;
	int id;

	public Customer(String n, int id) {
		this.n = n;
		this.id = id;
	}

	@Override
	public String toString() {
		return id + " " + n;
	}
}

class SortById3 implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		return o1.id - o2.id;
	}

}

class SortByName3 implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		return o1.n.compareTo(o2.n);
	}

}

public class Sample2_comparator {
	public static void main(String[] args) {
		ArrayList<Customer> l = new ArrayList<>();
		l.add(new Customer("Alex", 5));
		l.add(new Customer("Bob", 1));
		l.add(new Customer("Chidu", 4));
		l.add(new Customer("Dinuu", 3));
		l.add(new Customer("karthi", 2));
//		System.out.println(l);
//		Collections.sort(l,new SortById3());
		Collections.sort(l, new SortByName3());
		for (Customer x : l) {
			System.out.println(x.id + " " + x.n);
		}
	}

}
