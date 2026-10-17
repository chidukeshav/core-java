package DesignPattern;

public class Prototype_design_ptrn implements Cloneable {
	int stdid;
	String sname;
	char sec;

	public Prototype_design_ptrn(int stdid, String sname, char sec) {
		this.stdid = stdid;
		this.sname = sname;
		this.sec = sec;
	}

	@Override
	public String toString() {
		return "Student [stdid=" + stdid + ", sname=" + sname + ", sec=" + sec + "]";
	}

	public Prototype_design_ptrn clone() {
		try {
			return (Prototype_design_ptrn) super.clone();
		} catch (CloneNotSupportedException e) {

		}
		return null;
	}

	public static void main(String[] args) {
		Prototype_design_ptrn org = new Prototype_design_ptrn(123, "dinga", 'A');
		Prototype_design_ptrn copy = org.clone();
		System.out.println(org);
		System.out.println(copy);
	}
}