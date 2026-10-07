package Filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import polymorphism.main;

public class Data_write {
	public static void main(String[] args) throws IOException {
		File f1 = new File("C:\\Users\\chidu\\OneDrive\\Desktop\\jsp.txt");
		FileWriter fr = new FileWriter(f1,true);
		fr.write("hio");
		fr.write("heloo");
		fr.flush();
		System.out.println("data is writen");
		
				
	}

}
