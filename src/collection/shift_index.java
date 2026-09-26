package collection;

public class shift_index {
	static Object[]arr=new Object[10];
	static int index=0;
	static void add(Object obj) {
		
		arr[index]=obj;
		index++;
	}
	static void add(Object obj,int index) {
		System.arraycopy(arr, 2, arr, 3, 3);
		arr[index]=obj;
	}
	static void printing() {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=null) {
				System.out.println(arr[i]);
			}
			
		}
		}
		public static void main(String[]args) {
			add(10);
			add(20);
			add(30);
			add(40);
			add(50);
			printing();
			add('A',2);
			System.out.println("******");
			printing();
		}
		
		
	}


