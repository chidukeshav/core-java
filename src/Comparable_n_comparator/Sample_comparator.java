package Comparable_n_comparator;




import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Std {
	String n;
	int id;

	public Std(String n, int id) {
		this.n = n;
		this.id = id;
	}

	@Override
	public String toString() {
		return id + " " + n;
	}
}

class SortById implements Comparator<Std> {

	@Override
	public int compare(Std o1, Std o2) {
		return o1.id - o2.id;
	}

}

class SortByName implements Comparator<Std> {

	@Override
	public int compare(Std o1, Std o2) {
		return o1.n.compareTo(o2.n);
	}

}

public class Sample_comparator {
	public static void main(String[] args) {
		ArrayList<Std> l = new ArrayList<>();
		l.add(new Std("Sharath", 5));
		l.add(new Std("Chidu", 1));
		l.add(new Std("Mithun", 4));
		l.add(new Std("Dinuu", 3));
		l.add(new Std("karthi", 2));
		System.out.println(l);
		Collections.sort(l, new SortByName());
		for (Std x : l) {
			System.out.println(x.id + " " + x.n);
		}
	}
}

