package com.File;

import java.io.File;
import java.io.IOException;

public class FileExample {
	public static void main(String[] args) throws IOException {
		//FileExample fe = new FileExample();
		
		File file = new File("SampleText.txt");
		
		System.out.println("Do file exists..? "+file.exists()); //returns boolean type, it will check file exists or not
		
		System.out.println("Did File created..?"+file.createNewFile()); // It will create new file
		
		/*File file1 = new File("C:\\New folder\\Sample.txt");
		
		System.out.println("Do file1 exists..? "+file1.exists());*/
		
	}
}
