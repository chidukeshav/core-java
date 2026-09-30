package CollectionAssignment;

import java.util.ArrayList;

public class Mobile {
	String m_name;
	String m_color;
	int m_cost;
	public Mobile(String m_name, String m_color, int m_cost) {
		super();
		this.m_name = m_name;
		this.m_color = m_color;
		this.m_cost = m_cost;
	}
	@Override
	public String toString() {
		return "Mobile [m_name=" + m_name + ", m_color=" + m_color + ", m_cost=" + m_cost + "]";
	}
	public static void main(String[] args) {
		ArrayList<Mobile>m1=new ArrayList<Mobile>();
		m1.add(new Mobile("Sony","white",4545));
		m1.add(new Mobile("Apple","white",4545));
		for(int i = 0;i<m1.size();i++) {
			Object o1=m1.get(i);
			Mobile e1=(Mobile)o1;
			System.out.println(e1);
		}
	}
}
