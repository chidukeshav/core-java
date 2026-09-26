package encapsulation;

public class atm {
private int pin = 1234;
public int getpin () {
	return pin;
}
public void setpin(int pin) {
	this.pin = pin;
}
public static void main(String[]aegs) {
	atm a = new atm();
	System.out.println(a.pin);
	a.setpin(355);
	System.out.println(a.pin);
}
}
