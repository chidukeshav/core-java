package polymorphism;
class animal
{
	void noise()
	{
		System.out.println("Some Noise");
	}
}
class Dog extends animal
{
	void noise()
	{
		System.out.println("Bow Bow");
	}
}
class Cat extends animal
{
	void noise()
	{
		System.out.println("meow");
	}
}
class Snake extends animal
{
	void noise()
	{
		System.out.println("hiss");
	}
}
class Simulator
{
	static void ansim(animal a1)
	{
		a1.noise();
	}
}

public class main {
	public static void main(String[]args)
	{
		Cat c1 = new Cat();
		Dog d1 = new Dog();
		Snake s1 = new Snake();
		
		Simulator.ansim(s1);
		Simulator.ansim(c1);
		Simulator.ansim(d1);
	}

}
