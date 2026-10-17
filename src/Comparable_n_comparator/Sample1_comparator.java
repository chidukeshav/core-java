package Comparable_n_comparator;

//Comparator
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {
	String n;
	int id;

	public Employee(String n, int id) {
		this.n = n;
		this.id = id;
	}

	@Override
	public String toString() {
		return id + " " + n;
	}
}

class SortById2 implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.id - o2.id;
	}

}

class SortByName2 implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.n.compareTo(o2.n);
	}

}

public class Sample1_comparator {
	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<>();
		l.add(new Employee("Alex", 5));
		l.add(new Employee("Bob", 1));
		l.add(new Employee("Chidu", 4));
		l.add(new Employee("Dinuu", 3));
		l.add(new Employee("karthi", 2));
//	System.out.println(l);
//	Collections.sort(l,new SortById2());
		Collections.sort(l, new SortByName2());
		for (Employee x : l) {
			System.out.println(x.id + " " + x.n);
		}
	}
}