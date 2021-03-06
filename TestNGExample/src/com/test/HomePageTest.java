package com.test;


import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.sql.SQLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.main.HomePage;

public class HomePageTest {

	HomePage hp;
	
	@BeforeClass
	public void beforeClass(){
		hp = new HomePage();
		System.out.println("I'm in Before Class");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("I'm in before method");
	}
	
	@Test(groups={"santityTestGroup","functionalTestGroup"})
	public void verifyClickSignUp() throws Exception{
		assertEquals("Success",hp.clickSignUp());
		throw new Exception();
	}
	
	@Test(groups={"santityTestGroup","functionalTestGroup"}, timeOut=1000)//,expectedExceptions=SQLException.class)
	public void verifyClickLogin() {//throws SQLException{
		assertEquals("Success",hp.clickLogin());
		
	}
	
	@Test(groups = {"functionalGroupTest"})
	public void verifySearch(){
		assertEquals("Success",hp.doASearch());
	}
	
	@Test(dependsOnGroups = {"santityTestGroup"},alwaysRun=true,invocationCount=10)
	public void verifyAddress(){
		System.out.println("HomePage Address");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("I'm in after method");
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("I'm in After class");
	}
	

	
}
