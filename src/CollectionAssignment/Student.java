package CollectionAssignment;

import java.util.ArrayList;

public class Student {

	String std_name;
	int std_no;
	char std_sec;
	public Student(String std_name, int std_no, char std_sec) {
		
		this.std_name = std_name;
		this.std_no = std_no;
		this.std_sec = std_sec;
	}
	@Override
	public String toString() {
		return "School [std_name=" + std_name + ", std_no=" + std_no + ", std_sec=" + std_sec + "]";
	}
	public static void main(String[] args) {
		ArrayList<School>s1=new ArrayList<School>();
		s1.add(new School("raju",64647494,'A'));
		s1.add(new School("rani",64647494,'B'));
		s1.add(new School("Minthun",6464744,'C'));
		for(int i=0;i<s1.size();i++) {
//			Object o1=s1.get(i);
//			School r1=(School)o1;
			System.out.println(s1.get(i));
		}
		
	}
	
}
