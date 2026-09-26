package exceptionhandling;

 class main21{
	public static void main(String[] args) {
		int[]arr= {2,4,8,5,5,};
		try {
			System.out.println(arr[4]);
		
		try{
			int x =1/0;
		}
		catch(ArithmeticException e) {
			System.out.println("caught");
		}
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Handled");
		
	}
	}
}
