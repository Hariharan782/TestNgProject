package com.stackroute.suite1;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoTest3 {
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass() from DemoTest3");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("afterClass() from demoTest3");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod() from DemoTest3");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod() from DemoTest3");
	}
	
	@Test (priority = 1)
	public void test01() {
		Assert.assertTrue(true, "Demotest3 -- false");
	}
	
	@Test (priority = 2)
	public void test02() {
		int expectedValue = 4;
		int actualValue = 5;
		Assert.assertEquals(expectedValue, actualValue,"Demotest3 -- 4 is not equals to 5");
		Assert.assertNotEquals(expectedValue, actualValue, "Demotest3 -- 4 is equals to 5");
	}
	
	@Test (priority = 3)
	public void test03() {
		Assert.assertEquals(4, 4, "Demotest3 -- 4 is not equals to 4");
	}
}
