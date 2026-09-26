package collection;

public class sector {

    static Object[] arr = {1, 5, 9, 3, 8, 12};

    static void area(int input) {

        int r = input;
        int angle = input;

        final double pi = 3.14;

        double res = (angle / 360.0) * pi * r * r;

        System.out.println(res);
    }

    public static void main(String[] args) {

        for (int i = 0; i < arr.length; i++) {

            area((int) arr[i]);

        }
    }
}