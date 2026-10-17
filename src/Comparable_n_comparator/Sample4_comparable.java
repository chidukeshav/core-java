package Comparable_n_comparator;

// Comparable 

import java.util.ArrayList;
import java.util.Collections;

class Cust implements Comparable<Cust> {
	String n;
	int id;

	public Cust(String n, int id) {
		this.n = n;
		this.id = id;
	}

	@Override
	public String toString() {
		return id + " " + n;
	}

	@Override
	public int compareTo(Cust o) {

		return this.n.compareTo(o.n);
	}

}

public class Sample4_comparable {
	public static void main(String[] args) {
		ArrayList<Cust> l = new ArrayList<>();
		l.add(new Cust("Dhinak", 5));
		l.add(new Cust("Mithun", 1));
		l.add(new Cust("Sharath", 4));
		l.add(new Cust("Manu", 3));
		l.add(new Cust("Chidu", 2));
//		System.out.println(l);
		Collections.sort(l);
		for (Cust x : l) {
			System.out.println(x.id + " " + x.n);
		}
	}

}
