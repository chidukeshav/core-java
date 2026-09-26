package exceptionhandling;

public class main {
public static void main(String[] args) {
	try {
		int i =1/0;
	}
	catch(ArithmeticException e) {
		System.out.println("handled");
	}
}
}
