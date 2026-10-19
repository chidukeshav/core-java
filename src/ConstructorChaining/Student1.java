package ConstructorChaining;


//betweentheclass 1
class demo3{
	public demo3() {
		System.out.println("Details");
	}
}
public class Student1 extends demo3{
String name;
String college;
String branch;
public Student1(String name){
	this(name, "VTU");
}
public Student1(String name,String college){
	this(name,college,"CSE");
}
public Student1(String name,String college,String branch){
	this.name=name;
	this.college=college;
	this.branch=branch;
}
public static void main(String[] args) {
	Student1 s1 = new Student1("chidu");
	System.out.println(s1.name+" "+s1.college+" "+s1.branch);
}
}