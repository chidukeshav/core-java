package collection;

public class trapezoid1 {

    static Object[] arr = {10, 20, 5, 15, 25, 8};

    static void area(Object[] abb) {

        for (int i = 0; i < arr.length; i++) {

            int a = (int) abb[i];
            int b = (int) abb[i];
            int h = (int) abb[i];

            double res = 0.5 * (a + b) * h;

            System.out.println(res);
        }
    }

    public static void main(String[] args) {
        area(arr);
    }
}