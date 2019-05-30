package com.test;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class AssertionClass {

	
	private Assertion hardAssert = new Assertion();
    private SoftAssert softAssert = new SoftAssert();
    
    
   // @Test
    public void testHardAssert() 
    {
    	System.out.println("Hi I am First Statement in Hard Assert");
         hardAssert.assertEquals(3,3);
         System.out.println("First Hard Assert is Passed");
         hardAssert.assertEquals(1,2);
         System.out.println("Second Hard Assert Fails");       
    }
     

    @Test
    public void testSoftAssert() 
    {
    	System.out.println("Hi I am First Statement in Soft Assert");
         softAssert.assertEquals(3, 3);
         System.out.println("First Soft Assert is Passed");
         softAssert.assertEquals(1, 3);
         System.out.println("Second Soft Assert Fails");        
    }

    @Test
    public void testSoftAssertVerifyAll() 
    {
    	System.out.println("Hi I am First Statement in Soft Assert");
         softAssert.assertEquals(3, 3);
         System.out.println("First Soft Assert is Passed");
         softAssert.assertEquals(1, 3);
         System.out.println("Second Soft Assert Fails");     
         softAssert.assertAll();// Collect all the failure from the start of the test and report them. Should be the last statement. It uses the object in both  tests.    
    }

    
    
    
}
