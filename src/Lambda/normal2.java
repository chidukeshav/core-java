package Lambda;

interface Ellipse {
    void area();
}

public class normal2 {
    public static void main(String[] args) {
        Ellipse e = () -> {
            double a = 5;
            double b = 3;
            double pi = 3.14;
            System.out.println(pi * a * b);
        };
        e.area();
    }
}