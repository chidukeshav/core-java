package collection;

public class sector1 {

    static Object[] arr = {10, 90, 5, 180, 8, 60};

    static void area(Object[] abb) {

        for (int i = 0; i < arr.length; i++) {

            int r = (int) abb[i];
            int angle = (int) abb[i];

            final double pi = 3.14;

            double res = (angle / 360.0) * pi * r * r;

            System.out.println(res);
        }
    }

    public static void main(String[] args) {
        area(arr);
    }
}