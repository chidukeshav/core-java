package collection;

public class ellipse {

    static Object[] arr = {10, 5, 20, 8, 15, 6};

    static void area(Object[] abb) {

        for (int i = 0; i < arr.length; i++) {

            int a = (int) abb[i];
            int b = (int) abb[i];

            final double pi = 3.14;

            double res = pi * a * b;

            System.out.println(res);
        }
    }

    public static void main(String[] args) {
        area(arr);
    }
}