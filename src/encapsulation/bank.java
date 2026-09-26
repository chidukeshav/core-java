package encapsulation;

public class bank {
private  long phno = 42662562l;
public long getphno() {
	return phno;
}
public void setphno(long phno) {
	this.phno = phno;
}
public static void main(String[]args)
{
	bank b1 = new bank();
	System.out.println(b1.phno);
	b1.setphno(4656556);
	System.out.println(b1.phno);
	
}

}
