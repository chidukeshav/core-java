package Comparable_n_comparator;

// Comparable 

import java.util.ArrayList;
import java.util.Collections;

class St implements Comparable<St> {
	String n;
	int id;

	public St(String n, int id) {
		this.n = n;
		this.id = id;
	}

	@Override
	public String toString() {
		return id + " " + n;
	}

	@Override
	public int compareTo(St o) {
//			return o.id-this.id;
		return this.n.compareTo(o.n);
	}

}

public class Sample_comparable {
	public static void main(String[] args) {
		ArrayList<St> l = new ArrayList<>();
		l.add(new St("Alex", 5));
		l.add(new St("Bob", 1));
		l.add(new St("Chidu", 4));
		l.add(new St("Dinuu", 3));
		l.add(new St("karthi", 2));
//		System.out.println(l);
		Collections.sort(l);
		for (St x : l) {
			System.out.println(x.id + " " + x.n);
		}
	}

}
