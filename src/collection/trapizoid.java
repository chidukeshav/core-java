package collection;

public class trapizoid {

    static Object[] arr = {1, 5, 9, 3, 8, 12};

    static void area(int input) {

        int a = input;
        int b = input;
        int h = input;

        double res = 0.5 * (a + b) * h;

        System.out.println(res);
    }

    public static void main(String[] args) {

        for (int i = 0; i < arr.length; i++) {

            area((int) arr[i]);

        }
    }
}