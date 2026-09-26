package exceptionhandling;

public class main3 {
	public static void main(String[] args) {
		try {
			int a = Integer.parseInt("abc");
			System.out.println(a);
		}
		catch(NumberFormatException e) {
			System.out.println("handeled");
			
		}
		
	}

}
