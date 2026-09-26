package encapsulation;

public class facebook {
	private String pwd = "hiil";
	public String getpwd() {
		return pwd;
	}
	public void setpwd(String pwd) {
		this.pwd = pwd;
	}
	public static void main(String[]args) {
		facebook fb = new facebook();
		System.out.println(fb.getpwd());
		fb.setpwd("chidu");
		System.out.println(fb.getpwd());
	}

}
