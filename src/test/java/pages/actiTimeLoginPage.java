package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Base;

public class actiTimeLoginPage extends Base{
	
	@FindBy(id="username")  private WebElement txt_Username ;
	@FindBy(name="pwd") private WebElement txt_password;
	@FindBy(id="loginButton") private WebElement btn_lgbButton;
	@FindBy(xpath="//span[contains(text(),'Username or Password is invalid. Please try again')]") private WebElement err_msg;
	

	public actiTimeLoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this) ;
		}

	public void EnterUsername(String username)
	{
		txt_Username.sendKeys(username);
	}
	
	public void EnterPassword(String password)
	{
		txt_password.sendKeys(password);
	}
	
	public void ClickLogin()
	{
	btn_lgbButton.click();	
	}
	
	

}
