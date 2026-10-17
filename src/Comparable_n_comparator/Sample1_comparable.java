package Comparable_n_comparator;

// Comparable 

import java.util.ArrayList;
import java.util.Collections;

class Emp implements Comparable<Emp> {
	String n;
	int id;

	public Emp(String n, int id) {
		this.n = n;
		this.id = id;
	}

	@Override
	public String toString() {
		return id + " " + n;
	}

	@Override
	public int compareTo(Emp o) {
//			return o.id-this.id;
		return this.n.compareTo(o.n);
	}

}

public class Sample1_comparable {
	public static void main(String[] args) {
		ArrayList<Emp> l = new ArrayList<>();
		l.add(new Emp("Dhinak", 5));
		l.add(new Emp("Mithun", 1));
		l.add(new Emp("Sharath", 4));
		l.add(new Emp("Manu", 3));
		l.add(new Emp("Chidu", 2));
//		System.out.println(l);
		Collections.sort(l);
		for (Emp x : l) {
			System.out.println(x.id + " " + x.n);
		}
	}

}
