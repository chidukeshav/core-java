package interfacee;
interface Demo
{
	void area();
}
class ci implements Demo
{
	public void area()
	{
		double pi = 3.14;
		int r = 3;
		double res = pi*r*r;
		System.out.println(res);
	}
	
	
}
 class circleee {
	 public static void main(String[]args)
	 {
		 ci c1 = new ci();
		 c1.area();
	 }

}
