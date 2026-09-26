package interfacee;

interface inte {
	void start();
	void stop();
}
class omni implements inte
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
public class interf
{
	public static void main(String[]args)
	{
		omni o1 = new omni();
		o1.start();
		o1.stop();
	}
}
