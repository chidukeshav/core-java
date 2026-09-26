package collection;

public class parallagram1 {

    static Object[] arr = {10, 5, 20, 8, 15, 6};

    static void area(Object[] abb) {

        for (int i = 0; i < arr.length; i++) {

            int b = (int) abb[i];
            int h = (int) abb[i];

            double res = b * h;

            System.out.println(res);
        }
    }

    public static void main(String[] args) {
        area(arr);
    }
}