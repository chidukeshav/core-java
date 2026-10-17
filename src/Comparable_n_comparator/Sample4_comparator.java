package Comparable_n_comparator;

//Comparator
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Product {
	String n;
	int id;

	public Product(String n, int id) {
		this.n = n;
		this.id = id;
	}

	@Override
	public String toString() {
		return id + " " + n;
	}
}

class SortById5 implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		return o1.id - o2.id;
	}

}

class SortByName5 implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		return o1.n.compareTo(o2.n);
	}

}

public class Sample4_comparator {
	public static void main(String[] args) {
		ArrayList<Product> l = new ArrayList<>();
		l.add(new Product("Alex", 5));
		l.add(new Product("Bob", 1));
		l.add(new Product("Chidu", 4));
		l.add(new Product("Dinuu", 3));
		l.add(new Product("karthi", 2));
//	System.out.println(l);
		Collections.sort(l, new SortById5());
//	Collections.sort(l,new SortByName5());
		for (Product x : l) {
			System.out.println(x.id + " " + x.n);
		}
	}
}