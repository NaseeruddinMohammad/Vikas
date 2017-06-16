package com.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.main.CountVowels;

public class CountNoOfVowelsTest {
	
	CountVowels cv=null;
	public CountNoOfVowelsTest() {
		cv =new CountVowels();
	}
	
	@Test
	public void method1(){
		int actual = cv.CountNoOfVowels("Shanthi");
		int expected = 2;
		assertEquals(actual, expected);
	}
	
	@Test
	public void method2(){
		int actual = cv.CountNoOfVowels("123");
		int expected = 0;
		assertEquals(actual, expected);
	}
	
	@Test
	public void method3(){
		int actual = cv.CountNoOfVowels("sdfghj");
		int expected = 0;
		assertEquals(actual, expected);
	}
	
	@Test
	public void method4(){
		int actual = cv.CountNoOfVowels("Shanthi sonia");
		int expected = 5;
		assertEquals(actual, expected);
	}
	
	@Test
	public void method5(){
		int actual = cv.CountNoOfVowels("");
		int expected = 0;
		assertEquals(actual, expected);
	}
	
	@Test(expectedExceptions=NullPointerException.class)
	public void method6(){
		int actual = cv.CountNoOfVowels(null);
		int expected = 0;
		assertEquals(actual, expected);
	}
	
}
