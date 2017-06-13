package com.test;

import com.main.PrintMessage;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrintMessageTest {

	@Test
	public void method1(){
		String expected = "Hi Kulvinder";
		
		PrintMessage pm = new PrintMessage();
		String actual = pm.printString("Kulvinder");
		System.out.println("I'm in printMessage");
		assertEquals(expected,actual);
	}
	
	
	@Test
	public void method2(){
		String str1 = "hello";
		String str2 = "hai";
		String str3 = new String("hello");
		String str4 = new String("hai");
		String str5 = null;
		int a = 6;
		int b =5;
		int[] x = {1,3,2};
		int[] y = {1,3,2};
		
		assertEquals(str1, str3);
		assertNotEquals(str1,str5);
		assertNotNull(str2);
		assertNull(str5);
		assertTrue(a>b);
		assertFalse(a<b);
		assertSame(str4,str4);
		assertNotSame(str4, str3);
		assertArrayEquals(x,y);

	}
	
}
