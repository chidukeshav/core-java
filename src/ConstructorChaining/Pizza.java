package ConstructorChaining;

public class Pizza {
	String name;
	int qty;
	String size;
	public Pizza(String name) {
		this(name,1);
	}
	public Pizza(String name,int qty) {
		this(name,qty,"small");
		
	}
	public Pizza(String name,int qty,String size) {
		this.name=name;
		this.qty=qty;
		this.size=size;
		
	}
	public static void main(String[]args0) {
		Pizza p=new Pizza("Panner");
		System.out.println(p.name+" "+p.qty+" "+p.size);
	}
}
