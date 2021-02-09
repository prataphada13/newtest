package com.mb.newTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class newTest {
	

	@BeforeClass
	public void bfClass() {
		System.out.println("Class started");
	}
	
	@BeforeMethod
	public void bfMethod() {
		System.out.println("Method started");
	}
	@Test(priority = 1)
	public void testCase1() {
		System.out.println("Test case1 started");
	}
	
	@Test(priority = 2)
	public void testCase2() {
		System.out.println("Test case2 started");
	}
	
	@AfterMethod
	public void afMethod() {
		System.out.println("Method ended");
	}
	
	@AfterClass
	public void afClass() {
		System.out.println("class ended");
	}

}
