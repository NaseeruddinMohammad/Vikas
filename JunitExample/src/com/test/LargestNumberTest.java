package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.main.LargestNumber;


public class LargestNumberTest { // extends TestCase
	
	@Test
	public void Method1(){
		int[] arr = {1,23,54,20,80};
		int expected = 80;
		LargestNumber ln = new LargestNumber();
		int actual = ln.getLargest(arr);
		assertEquals(expected,actual);
		
		//System.out.println(max);
		
	}
	
	@Test
	public void Method2(){
		int[] arr = {1,-23,54,-20,-80};
		int expected = -23;
		LargestNumber ln = new LargestNumber();
		int actual = ln.getLargest(arr);
		assertEquals(expected,actual);
		//System.out.println(max);
	}
	
	@Test
	public void method3(){
		int[] arr = {1,23,23,20,80};
		int expected = 80;
		LargestNumber ln = new LargestNumber();
		int actual = ln.getLargest(arr);
		assertEquals(expected,actual);
		//System.out.println(max);
		
	}
	@Test
	public void Method4(){
		int[] arr = {1,0,54,-20,-80};
		int expected = 54;
		LargestNumber ln = new LargestNumber();
		int actual = ln.getLargest(arr);
		assertEquals(expected,actual);
		//System.out.println(max);
	}
	
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void Method5(){
		int[] arr = {};
		LargestNumber ln = new LargestNumber();
		int max = ln.getLargest(arr);
		//System.out.println(max);
	}
	
	
	/*public void testMethod1(){
		int[] arr = {1,23,54,20,80};
		LargestNumber ln = new LargestNumber();
		int max = ln.getLargest(arr);
		System.out.println(max);
		
	}
	
	public void testMethod2(){
		int[] arr = {1,-23,54,-20,-80};
		LargestNumber ln = new LargestNumber();
		int max = ln.getLargest(arr);
		System.out.println(max);
	}*/
		
}
