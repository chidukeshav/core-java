package CollectionAssignment;

import java.util.ArrayList;

public class Course {
	String cour_name;
	String cour_place;
	int cour_price;
	public Course(String cour_name, String cour_place, int cour_price) {
		super();
		this.cour_name = cour_name;
		this.cour_place = cour_place;
		this.cour_price = cour_price;
	}
	@Override
	public String toString() {
		return "Course [cour_name=" + cour_name + ", cour_place=" + cour_place + ", cour_price=" + cour_price + "]";
	}
	public static void main(String[] args) {
		ArrayList<Course>c1= new ArrayList<Course>();
		c1.add(new Course("java","bnglr",56565));
		c1.add(new Course("python","bnglr",56565));
		
		for(int i = 0;i<c1.size();i++) {
			Object o1=c1.get(i);
			Course e1=(Course)o1;
			System.out.println(e1);
		}
	}
}
