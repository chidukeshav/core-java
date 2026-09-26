package exceptionhandling;

public class main11 {
	public static void main(String[] args) {
		try {
			int x =1/0;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("handeled");
		}
		catch(ArithmeticException e) {
			System.out.println("caught");
		
		
		}
	}

}
