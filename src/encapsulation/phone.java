package encapsulation;

public class phone {
	private int lock = 1234;
	public int getlock() {
		return lock;
	}
	public void setlock(int lock) {
		this.lock = lock;
	}
	public static void main(String[]args) {
		phone p =new phone();
		System.out.println(p.getlock());
		p.setlock(4567);
		System.out.println(p.getlock());
	}

}
