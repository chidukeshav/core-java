package collection;

public class contains_method {
	static Object[]arr=new Object[10];
	static int index=0;
	static void add(Object obj) {
		arr[index]=0;
		index++;
	}
	
	static boolean contains(Object obj) {
		for(int i =0;i<arr.length;i++) {
			if((arr[i]!=null)&&(arr[i].equals(obj))) {
				return true;
				
			}
		}
		return false;
	}
	public static void main(String[] args) {
		arr[0]="bangalore";
		arr[1]="mysore";
		arr[2]="thailand";
		arr[3]="mandya";
		boolean x=contains("mysore");
				System.out.println(x);
	}

}
