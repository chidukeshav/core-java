package collection;

public class square {

    static Object[] arr = {1, 5, 9, 3, 8, 12};

    static void area(int input) {

        int s = input;

        double res = s * s;

        System.out.println(res);
    }

    public static void main(String[] args) {

        for (int i = 0; i < arr.length; i++) {

            area((int) arr[i]);

        }
    }
}