package learnTestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDemo2 extends BaseClass {

	  
	
	@DataProvider
	public Object[][] getdata() 
	{
		//Object[Invocation count][Parameters]
		 Object[][] data=new Object[2][2];
		 data[0][0]="User1";
		 data[0][1]="Password1";
		 data[1][0]="User2";
		 data[1][1]="Password2";		 
		 return data;	
		
	}
	@Test(priority = 1,dataProvider = "getdata")
	public void m(String user,String pwd)
	{
		System.out.println("Im in m() method");
		System.out.println("User: "+user+"  Pwd:"+pwd);		
	}
	
	
	
	@Test
	public void m1()
	{
		System.out.println("Im in m1() method");
	}
	
	@Test(priority = 0)
	public void n1()
	{
		System.out.println("Im in n1() method");
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
