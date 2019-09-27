package ActiTime;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Utils;

public class actiTimeLogin {

	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
	}
	
	@DataProvider
	public Object[][] getData() throws FileNotFoundException, IOException, Exception
	{
		int rowCnt = Utils.XL_RowCount("Sheet1");
		Object[][] data= new Object[rowCnt][2];
//		Utils.XL_Read("Sheet1", rowNum, cellNum);
		return data;
		
	}


	@Test(dataProvider = "getData")
	public void actiTimeLogin(String username , String password) {
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		WebElement txt_username = driver.findElement(By.id("username"));
		WebElement txt_password = driver.findElement(By.name("pwd"));
		WebElement btn_Login = driver.findElement(By.id("loginButton"));

		txt_username.sendKeys(username);
		txt_password.sendKeys(password);
		btn_Login.click();


	}


}
