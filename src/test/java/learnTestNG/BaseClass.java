package learnTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Im in Before Suite method");
	}
	
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("Im in After Suite method");
	}

	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("Im in Before Test method");
	}
	

	@AfterTest
	public void AfterTest()
	{
		System.out.println("Im in After Test method");
	}
	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("Im in Before Class method");
	}
	

	@AfterClass
	public void AfterClass()
	{
		System.out.println("Im in After Class method");
	}
	
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("Im in Before Method method");
	}
	

	@AfterMethod
	public void Afterethod()
	{
		System.out.println("Im in After Method method");
	}
	
	@BeforeGroups
	public void BeforeGroup() {
		System.out.println("Im in Before Group method");
	}
	

	@AfterGroups
	public void AfterGroup() {
		System.out.println("Im in After Group method");
	}
}
