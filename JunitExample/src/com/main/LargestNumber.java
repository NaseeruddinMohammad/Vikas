package com.main;

public class LargestNumber {
	
	//find largest no. from a given array arr = {1,23,54,20,80}
	public int getLargest(int[] arr){
		int max = 0;  //max =1
		//try{
			max = arr[0];       

		for(int i=1;i<arr.length;i++){  //i=1       i=2      i=3      i=4
			
			if(arr[i]>max){				//23>1      54>23    20>54    80>54
				max = arr[i];			//max =23   max =54  max =54  max =80
			}
			
		}
		
		
		//}
		//
		return max;
	}
	
	/*public static void main(String[] args) {
		
		int[] arr = {1,23,54,20,80};
		LargestNumber ln = new LargestNumber();
		int max = ln.getLargest(arr);
		System.out.println(max);
				
	}
	*/
	
}
