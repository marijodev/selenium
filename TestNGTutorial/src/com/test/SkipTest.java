package com.test;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTest {

	@Test(enabled = false)// Is not accounted.
	public void firstTest()
	{System.out.println("First Test");}
	
	@Test
	public void secondTest()//skipped
	{System.out.println("Second Test");
	throw new SkipException("Declare your message-Login Fail");
	}
	@Test
	public void thirdTest()
	{System.out.println("Third Test");}

	
}
