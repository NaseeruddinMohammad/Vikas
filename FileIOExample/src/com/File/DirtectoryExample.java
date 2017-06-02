package com.File;

import java.io.File;
import java.io.IOException;

public class DirtectoryExample {
	public static void main(String[] args) {
		
		File dir = new File("Directory");
		
		dir.mkdir();
		
		File file = new File("Directory","SampleText.txt");
		System.out.println(file.exists());
		try {
			System.out.println(file.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
