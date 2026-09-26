package encapsulation;

public class adhar {
	private String adress= "belur";
	public String getadress() {
		return adress;
	}
	public void setpwd(String adress) {
		this.adress = adress;
	}
	public  static void main(String[]args) {
		adhar a = new adhar();
		System.out.println(a.getadress());
		a.setpwd("hassan");
		System.out.println(a.getadress());
	}

}
