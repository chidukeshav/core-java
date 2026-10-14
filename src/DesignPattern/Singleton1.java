package DesignPattern;


class Icici_Bank_01{
	private int bal=5000;
	static Icici_Bank_01 a1;
	static public Icici_Bank_01 getInstance() {
		if(a1==null) {
			a1=new Icici_Bank_01();
			
		}
		return a1;
		
	}
	public int getBal() {
		return bal;
	}
	
	
}
public class Singleton1 {
	public static void main(String[] args) {
		Icici_Bank_01 Bang_branch=Icici_Bank_01.getInstance();
		System.out.println(Bang_branch.getBal());
		Icici_Bank_01 Mang_branch=Icici_Bank_01.getInstance();
		System.out.println(Mang_branch.getBal());
	}

}
