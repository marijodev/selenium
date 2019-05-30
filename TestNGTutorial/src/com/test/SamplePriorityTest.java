package com.test;

import org.testng.annotations.Test;

public class SamplePriorityTest {

	@Test (groups = {"smoke", "regression"})
	public void firstTest()
	{
		long id = Thread.currentThread().getId();
		System.out.println("First Test " + id );
	}
	
	@Test(priority = 1 , groups = "sanity")
	public void secondTest()
	{
		long id = Thread.currentThread().getId();
		System.out.println("Second Test " + id );
	}

	@Test(priority = 2,groups = "sanity")
	public void thirdTest()
	{
		long id = Thread.currentThread().getId();
		System.out.println("Third Test " + id);
	}

	@Test(priority = 3, groups = "smoke")
	public void forthTest()
	{
		long id = Thread.currentThread().getId();
		System.out.println("Forth Test " + id);
	}
	
	@Test(priority = 4, groups = "functional")
	public void fifthTest()
	{
		long id = Thread.currentThread().getId();
		System.out.println("Fifth Test " + id);
	}

	

	
	
}
