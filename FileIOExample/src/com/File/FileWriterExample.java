package com.File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class FileWriterExample {
	public static void main(String[] args) throws IOException {

		File file = new File("SampleText.txt");
		
		
		int[] arr = {1,2,3,4};
		
		System.out.println("Do file exists..? "+file.exists()); //returns boolean type, it will check file exists or not
		
		FileInputStream input = null;
		
		try {
			int a = arr[4];
			FileWriter fr = new FileWriter(file);
			fr.write("Hello This is InnovapatH....\n");
			fr.flush();
			fr.close();	
			
			input = new FileInputStream("file");
			//System.out.println("Did File created..?"+file.createNewFile());
			
		} catch (FileNotFoundException e) {
			
			System.out.println("Ooops....File is not there...");
		} 
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Your array accessing which is not present");
		}
		finally{
			if(input!=null){
				try{
				input.close();
				}
				catch(IOException e){
					e.printStackTrace();
				}
			}
		}
	}
}
