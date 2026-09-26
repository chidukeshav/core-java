package exceptionhandling;

public class main2 {
public static void main(String[] args) {
	int[]arr= {4,5,6,7,7,};
	try {
		System.out.println(arr[9]);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("caught");
	}
}
}
