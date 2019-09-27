package scripts;

import org.testng.annotations.Test;

import generic.Base;
import pages.actiTimeLoginPage;

public class Test_ValidLogin extends Base
{

	@Test
	public void validLogin_test() {
		
		actiTimeLoginPage at=new actiTimeLoginPage(driver);
		at.EnterUsername("admin");
		at.EnterPassword("manager");
		at.ClickLogin();
		
	}
	
}
