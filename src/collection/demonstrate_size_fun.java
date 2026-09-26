package collection;



public class demonstrate_size_fun {
	static Object[]arr=new Object[10];
	static int count=0;
	static int size()
	{
		for(int i =0;i<arr.length;i++) {
			if(arr[i]!=null) {
				count++;
			}
			
		}
		return count;
	}
	
		public static void main(String[]args) {
			arr[0]=10;
			arr[1]=20.6;
			arr[2]="Hello";
			System.out.println(arr.length);
			System.out.println(size());
		
	}

}
