package Comparable_n_comparator;

// Comparable 

import java.util.ArrayList;
import java.util.Collections;

class Prsn implements Comparable<Prsn> {
	String n;
	int id;

	public Prsn(String n, int id) {
		this.n = n;
		this.id = id;
	}

	@Override
	public String toString() {
		return id + " " + n;
	}

	@Override
	public int compareTo(Prsn o) {
			return o.id-this.id;
		
	}

}

public class Sample3_comparable {
	public static void main(String[] args) {
		ArrayList<Prsn> l = new ArrayList<>();
		l.add(new Prsn("Dhinakar", 5));
		l.add(new Prsn("Mithun", 1));
		l.add(new Prsn("Sharath", 4));
		l.add(new Prsn("Manu", 3));
		l.add(new Prsn("Chidu", 2));
//		System.out.println(l);
		Collections.sort(l);
		for (Prsn x : l) {
			System.out.println(x.id + " " + x.n);
		}
	}

}
