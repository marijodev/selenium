package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationExecutionOrder {

	@BeforeClass
	public void firstMethod() {
		System.out.println("In before class");
	}
	
	@AfterClass
	public void sixMethod() {
		System.out.println("In after class");
	}
	
	@BeforeMethod
	public void secondMethod() {
		System.out.println("In before method");
	}
	@AfterMethod
	public void sevendMethod() {
		System.out.println("In after method");
	}
	
	@BeforeSuite
	public void thirdMethod() {
		System.out.println("In before suite");
	}
	
	@AfterSuite
	public void eightMethod() {
		System.out.println("In after suite");
	}
	
	@BeforeTest
	public void forthMethod() {
		System.out.println("In before test");
	}
	@AfterTest
	public void nineMethod() {
		System.out.println("In after  test");
	}
	
	@Test
	public void fifthMethod() {
		System.out.println("In test");
	}
}
