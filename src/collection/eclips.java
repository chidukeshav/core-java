package collection;

public class eclips {

    static Object[] arr = {1, 5, 9, 3, 8, 12};

    static void area(int input) {

        int a = input;
        int b = input;

        final double pi = 3.14;

        double res = pi * a * b;

        System.out.println(res);
    }

    public static void main(String[] args) {

        for (int i = 0; i < arr.length; i++) {

            area((int) arr[i]);

        }
    }
}