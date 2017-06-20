package com.test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class CommonTest {

	@BeforeSuite
	public void beforeSuite(){
		System.out.println("I'm in before Suite");
	}
		
	@BeforeTest
	public void beforeTest(){
		System.out.println("I'm in before Test");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("I'm in after Test");
	}
	
	@AfterSuite
	public void afterSuite(){
		System.out.println("I'm in after Suite");
	}
}
