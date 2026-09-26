package collection;


	public class triangle {

	    static Object[] arr = {1, 5, 9, 3, 8, 12};

	    static void area(int input) {

	        int b = input;
	        int h = input;

	        double res = 0.5 * b * h;

	        System.out.println(res);
	    }

	    public static void main(String[] args) {

	        for (int i = 0; i < arr.length; i++) {

	            area((int) arr[i]);

	        
	    }
	}
}
