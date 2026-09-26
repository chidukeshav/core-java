package polymorphism;
class Mobie
{
	void select()
	{
		System.out.println("Select device");
	}
}
class Oppo extends Mobie
{
	void select()
	{
		System.out.println("Select Oppo");
	}
}
class vivo extends Mobie
{
	void select()
	{
		System.out.println("Select vivo");
	}
}
class Redme extends Mobie
{
	void select()
	{
		System.out.println("Select Redme");
	}
}
class Simulato
{
	static void Buy(Mobie a1)
	{
		a1.select();
	}
}

public class main2 {
	public static void main(String[]args)
	{
		 Oppo c1 = new Oppo();
		vivo d1 = new vivo();
		Redme s1 = new Redme();
		
		Simulato.Buy(s1);
		Simulato.Buy(c1);
		Simulato.Buy(d1);
	}

}
