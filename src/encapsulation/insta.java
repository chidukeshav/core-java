package encapsulation;

public class insta {
private String pwd = "abcd";
public String getpwd() {
	return pwd;
}
public void setpwd(String pwd) {
	this.pwd = pwd;
}
public static void main(String[]args) {
	insta i1 = new insta();
	System.out.println(i1.pwd);
	i1.setpwd("bvgg");
	System.out.println(i1.pwd);
	
}
}
