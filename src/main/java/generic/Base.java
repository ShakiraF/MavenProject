package generic;

import java.sql.Driver;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base implements AutoConstant {
	
	public static WebDriver driver;
	static
	{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		
	}
	
	
	@BeforeMethod
	public static void  pre_method()
	{
		driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(IMPLICITWAIT, TimeUnit.SECONDS);
				
	}
	
	@AfterMethod
	public static void post_method()
	{
		System.out.println("");
		System.out.println("");
		driver.close();
	}
	
	

}
