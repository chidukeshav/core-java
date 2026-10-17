package Comparable_n_comparator;


	// Comparable 

	import java.util.ArrayList;
	import java.util.Collections;

	class Prd implements Comparable<Prd>{
		String n;
		int id;
		public Prd(String n, int id) {
			this.n = n;
			this.id = id;
		}
		@Override
		public String toString() {
			return id+" "+n;
		}
		@Override
		public int compareTo(Prd o) {
			return this.id-o.id;
			//return this.n.compareTo(o.n);
		}
		
		
	}
	public class Sample2_comparable {
	public static void main(String[] args) {
		ArrayList<Prd> l=new  ArrayList<>();
		l.add(new Prd("Sharath", 4));
		
		l.add(new Prd("Chidu", 3));
		l.add(new Prd("Dhinkar", 1));
		l.add(new Prd("Chandru", 2));
		
//		System.out.println(l);
		Collections.sort(l);
		for(Prd x:l) {
			System.out.println(x.id+" "+x.n);
		}
	}
	
}
