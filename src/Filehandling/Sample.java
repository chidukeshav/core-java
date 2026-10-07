package Filehandling;

import java.io.File;

public class Sample {
	public static void main(String[] args) {
		File f1=new File("C:\\Users\\chidu\\OneDrive\\Desktop\\jsp.txt");
		if(f1.mkdirs()) {
			System.out.println("folder created");
		}
		else {
			System.out.println("folder not created");
		}
		if(f1.exists()) {
			System.out.println("folder exits");
		}
		else {
			System.out.println("not exits");
		}
		if(f1.delete()) {
			System.out.println("folder is deleted");
		}
		else {
			System.out.println("not deleted");
			
		}
	}

}
