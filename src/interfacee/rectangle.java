package interfacee;
interface rect
{
	void area();
}
class re implements rect
{
	public void area()
	{
		int h = 5;
		int b = 3;
		double res = h*b;
		System.out.println(res);
	}
	
	
}
 class rectangle{
	 public static void main(String[]args)
	 {
		 re c1 = new re();
		 c1.area();
	 }

}
