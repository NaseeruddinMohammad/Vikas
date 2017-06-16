package com.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.main.ParameterizedExample;

@RunWith(Parameterized.class)
public class ParameterizedExampleTest {
	
	public int input;
	public String expected;
	static ParameterizedExample pe = null;
	
	public ParameterizedExampleTest(int input, String expected){
		System.out.println("I'm in constructor");
		this.input = input;
		this.expected = expected;
	}
	
	@BeforeClass
	public static void crteteObj(){
		System.out.println("I'm in @BeforeClass");
		pe = new ParameterizedExample();
	}
	
	@Parameters
	public static Collection getData(){
		System.out.println("I'm passing data");
		Object[][] data = new Object[][]{{6,"even"},{3,"odd"},{14,"even"}};
		return Arrays.asList(data);
	}
	
	@Test
	public void method1(){
		String actual = pe.evenOrOdd(input);
		System.out.println("Now I'm testing with :input:"+ input+ ":actual:"+ actual +":expected:" + expected);
		assertEquals(actual,expected);
	}
	
}
