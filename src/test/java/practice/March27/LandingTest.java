package practice.March27;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Base.browser;

import objects.LandingPage;

public class LandingTest extends browser {
 public WebDriver driver;
  
 @Test

	public void Creditapp() throws IOException
	{
		driver=callbrowser();
		 driver.get("https://www.rbcroyalbank.com/ways-to-bank/online-banking/index.html");
		LandingPage lp=new LandingPage(driver);
		Actions a=new Actions(driver);
		a.moveToElement(lp.CreditCards()).build().perform();
		lp.ImproveScore().click();
		lp.Applyonline().click();
		
		
	}
 @Test
 public void gohome()
 {
 System.out.println("work to be done");
 }
}
