package com.stackroute.suite2;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class NewDemoTest1 {
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass() from NewDemoTest1");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("afterClass() from NewDemoTest1");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod() from NewDemoTest1");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod() from NewDemoTest1");
	}
	
	@Test (priority = 1)
	public void test01() {
		Assert.assertTrue(true);
	}
	
	@Test (priority = 2)
	public void test02() {
		int expectedValue = 4;
		int actualValue = 5;
		Assert.assertEquals(expectedValue, actualValue,"4 is not equals to 5");
		Assert.assertNotEquals(expectedValue, actualValue, "4 is equals to 5");
	}
	
	@Test (priority = 3)
	public void test03() {
		Assert.assertEquals(4, 4, "4 is not equals to 4");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite() from NewDemoTest1===============");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite() from DemoteTest1=================");
	}
}
