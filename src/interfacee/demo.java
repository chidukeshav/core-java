package interfacee;
interface Sample
{
	void area();
}
class circle implements Sample
{
	public void area()
	{
		double pi = 3.14;
		int r = 3;
		double res = pi*r*r;
		System.out.println(res);
	}
	
	
}
 class demo {
	 public static void main(String[]args)
	 {
		 circle c1 = new circle();
		 c1.area();
	 }

}
