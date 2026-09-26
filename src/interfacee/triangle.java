package interfacee;
interface tt
{
	void area();
}
class tri implements tt
{
	public void area()
	{
		int h = 5;
		int b = 3;
		double res = 0.5*h*b;
		System.out.println(res);
	}
	
	
}
 class triangle{
	 public static void main(String[]args)
	 {
		 tri c1 = new tri();
		 c1.area();
	 }

}
