package CollectionAssignment;

import java.util.ArrayList;

public class Employee {
	String emp_name;
	int emp_id;
	double emp_sal;
	public Employee(String emp_name, int emp_id, double emp_sal) {
		this.emp_name = emp_name;
		this.emp_id = emp_id;
		this.emp_sal = emp_sal;
	}
	@Override
	public String toString() {
		return "Employee [emp_name=" + emp_name + ", emp_id=" + emp_id + ", emp_sal=" + emp_sal + "]";
	}
	public static void main(String[] args) {
		ArrayList<Employee>a1=new ArrayList<Employee>();
		a1.add(new Employee("Raju",101,5898.00));
		a1.add(new Employee("Rani",102,5898.00));
		a1.add(new Employee("Mithun",103,5898.00));
		for(int i = 0;i<a1.size();i++) {
			Object o1=a1.get(i);
			Employee e1=(Employee)o1;
			System.out.println(e1);
			
		}
	}
	
	
	
}
