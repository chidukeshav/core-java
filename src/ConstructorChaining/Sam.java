package ConstructorChaining;
// this
public class Sam {
	public Sam() {
		this("This is second");
		System.out.println("This is First");
	}
	public Sam(String a) {
		this("This is", "Third");
		System.out.println(a);
	}
	public Sam(String a,String b) {
		System.out.println(a+" "+b);
	}
public static void main(String[] args) {
	Sam s=new Sam();
}
}
