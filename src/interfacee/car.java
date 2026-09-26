package interfacee;

interface carrr {
	void start();
	void stop();
}
class caar implements carrr
{
	public void start()
	{
		System.out.println("start by key");
	}
	public void stop()
	{
		System.out.println("start by key");
	}
	

}
public class car
{
	public static void main(String[]args)
	{
		caar o1 = new caar();
		o1.start();
		o1.stop();
	}
}
