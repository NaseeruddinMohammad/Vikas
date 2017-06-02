package com.File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilerReaderExample {
	public static void main(String[] args) {
		File file = new File("SampleText.txt");
		FileWriter fw;
		try {
			fw = new FileWriter(file);
			fw.write(" Hello This is InnovapatH....\n");
			fw.write("Hello This is Vikas\n Hello world");
			fw.flush();
			fw.close();	
			FileReader fr = new FileReader(file); 
			/*char[] ch = new char[30];
			fr.read(ch);*/
			/*for(int i=0;i<ch.length;i++){
				System.out.print(ch[i]);
			}*/
			
			BufferedReader br = new BufferedReader(fr);
			System.out.println("First line::"+ br.readLine());
			System.out.println("SecondLine::"+ br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
