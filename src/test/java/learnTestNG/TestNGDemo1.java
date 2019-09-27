package learnTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo1 {

	@Test
	public void m()
	{
		System.out.println("Im in m() method");
	}
	
	
	
	@Test(priority = 1)
	public void m1()
	{
		System.out.println("Im in m1() method");
	}
	
	@Test(priority = 2)
	public void m2()
	{
		System.out.println("Im in m2() method");
	}
	
	@Test(priority = 3)
	public void m3()
	{
		System.out.println("Im in m3() method");
		Assert.fail("Method m3() was purposelyfailed to understand depends behavior in TestNG");
	}
	
	@Test(priority = 4,invocationCount = 3)
	public void m4()
	{
		System.out.println("Im in m4() method");
	}
	
	@Test(priority = 5,dependsOnMethods = "m3")
	public void m5()
	{
		System.out.println("Im in m5() method");
	}
	
	
	
}
