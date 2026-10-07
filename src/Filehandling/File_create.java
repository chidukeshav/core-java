package Filehandling;

import java.io.File;
import java.io.IOException;

public class File_create {
	public static void main(String[] args) throws IOException {
		File f1=new File("C:\\Users\\chidu\\OneDrive\\Desktop\\jsp.tar");
		if(f1.createNewFile() ) {
			System.out.println("file is created");
		}
		else {
			System.out.println("Not created");
		}
	}

}
