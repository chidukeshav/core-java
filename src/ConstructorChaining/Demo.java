package ConstructorChaining;

public class Demo {
	public Demo() {
		System.out.println("This is Demo");
	}
	
}
 class Sam22 extends Demo{
	public Sam22() {
		this("This is Second");
		System.out.println("This is First");
	}
	public Sam22(String a) {
		this("This is","Third");
		System.out.println(a);
				
	}
	public Sam22(String a,String b) {
		super();
		System.out.println(a+" "+b);
	}
	public static void main(String[] args) {
		
			Sam22 s=new Sam22();
	}
}