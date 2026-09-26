package encapsulation;

public class snap {
	private String pwd = "chidu";
	public String getpwd() {
		return pwd;
	}
	public void setpwd(String pwd) {
		this.pwd = pwd;
		
	}
	public static void main(String[]args) {
		snap s = new snap();
		System.out.println(s.getpwd());
		s.setpwd("chiddd");
		System.out.println(s.getpwd());
	}

}
