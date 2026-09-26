package polymorphism;

class Films
{
    void watch()
    {
        System.out.println("Select Films");
    }
}

class Horror extends Films
{
    void watch()
    {
        System.out.println("Select Horror");
    }
}

class Action extends Films
{
    void watch()
    {
        System.out.println("Select Action");
    }
}

class Comedy extends Films
{
    void watch()
    {
        System.out.println("Select Comedy");
    }
}

class Simula
{
    static void Buy(Films a1)
    {
        a1.watch();
    }
}

public class main4
{
    public static void main(String[] args)
    {
        Comedy c1 = new Comedy();
        Action a1 = new Action();
        Horror s1 = new Horror();

        Simula.Buy(s1);
        Simula.Buy(c1);
        Simula.Buy(a1);
    }
}