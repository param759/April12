package practice.March27;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.browser;
import objects.loginpage;

public class LoginTest extends browser {
public WebDriver driver;
	
	@Test
	public void userlogin() throws IOException
	{
		driver=callbrowser();
driver.get("https://www.rbcroyalbank.com/ways-to-bank/online-banking/index.html");
		
		//    driver.get(prep.getProperty("url"));
		loginpage lp=new loginpage(driver);	
		lp.usersignin().sendKeys("dispatch@sethiinternational.ca");
		lp.enterpass().sendKeys("Harman@987");
		lp.clicklogin().click();
	}
}
