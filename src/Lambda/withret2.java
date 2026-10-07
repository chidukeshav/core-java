package Lambda;

interface Sector {
    double area();
}

public class withret2 {
    public static void main(String[] args) {
        Sector s = () -> {
            double r = 5;
            double angle = 90;
            double pi = 3.14;
            return ((angle / 360) * pi * r * r);
        };
        System.out.println(s.area());
    }
}