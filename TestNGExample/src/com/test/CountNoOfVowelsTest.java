package com.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.main.CountVowels;

public class CountNoOfVowelsTest {
	
	CountVowels cv;
	
	@Parameters({"input"})
	@Test(invocationCount=10)
	public void  test(String input){
		System.out.println(input);
	}
	
	
	/*@DataProvider(name = "inputData")
	public Object[][] getData(){
		return new Object[][]{{"hello",2},{"today",2},{"Hai",2}};
	}
*/
	
	@BeforeClass
	public void beforeClass(){
		cv = new CountVowels();
		System.out.println("I'm in Before Class");
	}

/*	
	@Test(dataProvider="inputData")
	public void method1(String input,int expected){
		int actual = cv.CountNoOfVowels(input);
		assertEquals(actual, expected);
	}*/
	
/*	@Test
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
	}*/
	
}