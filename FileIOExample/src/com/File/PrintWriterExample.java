package com.File;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterExample {
	public static void main(String[] args) throws IOException {
		try{
		PrintWriter pw = new PrintWriter("SampleText.txt");
		
		FileWriter fw = new FileWriter("SampleText.txt");
		BufferedWriter bw = new BufferedWriter(pw);
		/*pw.println("Hey Hii...");
		pw.print("Hello Alll....");
		pw.flush();
		pw.close();*/
		
		bw.write("Hello");
		bw.flush();
		bw.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
}
