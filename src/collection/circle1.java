package collection;

public class circle1 {

	 static Object[] arr = {1,5,9,3,8,12};

	static void area(Object[] abb) {

		for(int i = 0 ;i<arr.length;i++){

			int r = (int)abb[i];

			final double pi = 3.14;

			double res = pi*r*r;

			System.out.println(res);

		}

	}

	public static void main(String[] args) {

		area(arr);

	}

}