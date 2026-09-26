package polymorphism;
class Lg
{
	void select()
	{
		System.out.println("Select device");
	}
}
class Mobile extends Lg
{
	void select()
	{
		System.out.println("Select Mobile");
	}
}
class Refrigirator extends Lg
{
	void select()
	{
		System.out.println("Select ref");
	}
}
class Telivision extends Lg
{
	void select()
	{
		System.out.println("Select Television");
	}
}
class Simulatorr
{
	static void Buy(Lg a1)
	{
		a1.select();
	}
}

public class main1 {
	public static void main(String[]args)
	{
		 Mobile c1 = new Mobile();
		Refrigirator d1 = new Refrigirator();
		Telivision s1 = new Telivision();
		
		Simulatorr.Buy(s1);
		Simulatorr.Buy(c1);
		Simulatorr.Buy(d1);
	}

}
