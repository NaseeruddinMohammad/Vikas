package com.main;

public class CountVowels {

	public int CountNoOfVowels(String str){
		int count =0;
		str = str.toLowerCase();
		
		for(int i =0; i<str.length();i++){
			char ch = str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
				count++;
			}
		}
		
		
		return count;
	}
}
