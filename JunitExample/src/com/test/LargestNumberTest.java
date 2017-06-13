package com.test;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.main.LargestNumber;


public class LargestNumberTest { // extends TestCase
	
	int expected = 0;
	Scanner sc = null;
	static LargestNumber ln = null;
	
	@BeforeClass
	public static void setupObj(){
		System.out.println("In Before class");
		ln = new LargestNumber();
	}
	
	@Before
	public void getInput(){
		System.out.println("In Before Annotation");
		sc = new Scanner(System.in);
		expected = sc.nextInt();
	}
	
	@Test
	public void Method1(){
		int[] arr = {1,23,54,20,80};
		//int expected = 80;
		//LargestNumber ln = new LargestNumber();
		int actual = ln.getLargest(arr);
		assertEquals(expected,actual);
		
		//System.out.println(max);
		
	}
	
	@Test(timeout=50)
	public void Method2(){
		int[] arr = {1,-23,54,-20,-80};
		//int expected = -23;
		//LargestNumber ln = new LargestNumber();
		int actual = ln.getLargest(arr);
		assertEquals(expected,actual);
		//System.out.println(max);
	}
	
	@Ignore
	@Test
	public void method3(){
		int[] arr = {1,23,23,20,80};
		//int expected = 80;
		//LargestNumber ln = new LargestNumber();
		int actual = ln.getLargest(arr);
		assertEquals(expected,actual);
		//System.out.println(max);
		
	}
	
	@Ignore
	@Test
	public void Method4(){
		int[] arr = {1,0,54,-20,-80};
		//int expected = 54;
		//LargestNumber ln = new LargestNumber();
		int actual = ln.getLargest(arr);
		assertEquals(expected,actual);
		//System.out.println(max);
	}
	
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void Method5(){
		int[] arr = {};
		//LargestNumber ln = new LargestNumber();
		int max = ln.getLargest(arr);
		//System.out.println(max);
	}
	
	@After
	public void clearInput(){
		System.out.println("In After Annotation");
		sc = null;
		expected =0;
	}
	
	@AfterClass
	public static void clearObj(){
		System.out.println("In After class");
		ln = null;
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
