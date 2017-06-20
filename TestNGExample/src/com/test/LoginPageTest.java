package com.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.main.LoginPage;


public class LoginPageTest {
	
	LoginPage lp;
	
	@BeforeClass
	public void beforeClass(){
		lp = new LoginPage();
		System.out.println("I'm in Before Class");
	}
	
	@Test
	public void checkLogin(){
		assertEquals("Success",lp.testLogin());
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("I'm in after Class");
	}

	
}
