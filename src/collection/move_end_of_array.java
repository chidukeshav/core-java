package collection;
import java.util.Arrays;
public class move_end_of_array {
	static Object[]arr=new Object[10];
	static Object[]abb=new Object[10];
	
	static int Index=0;
	static void add(Object[]obj,Object val) {
		obj[Index++]=val;
	}
	static int index2=0;
	static void add2(Object[]obj,Object val) {
		obj[index2++]=val;
	}
	static int size(Object[] obj) {
		int count=0;
		for(int i=0;i<obj.length;i++) {
			if(obj[i]!=null) {
				count++;
			}
			
		}
		return count;
		}
	static void add(Object[]arr,Object[]abb) {
		System.arraycopy(arr, 0, abb, size(abb), size(arr));
	
	}
	static void printing(Object[]obj) {
		for(int i=0;i<obj.length;i++) {
			if(obj[i]!=null) {
				System.out.println(obj[i] );
			}
		}
	}
	public static void main(String[] args) {
		add(arr,10);
		add(arr,20);
		add(arr,30);
		add(arr,40);
		add(arr,50);
		add2(abb,'A');
		add2(abb,'B');
		add2(abb,'C');
		add2(abb,'D');
		add(arr,abb);
		printing(abb);
		
	}

}
