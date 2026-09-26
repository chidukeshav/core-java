package collection;

public class main1 {
	static Object[]arr= {10,20,30,40};
	static void remove(int index) {
		arr[index]=null;
	}
		static void printing() {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]!=null) {
					System.out.println(arr[i]);
				}
			}
		}
			public static void main(String[]args) {
				printing();
				remove(2);
				
			}
		}
	

