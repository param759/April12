package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By Credit=By.cssSelector("ul.mega-menu-lobs>li:nth-child(2)");
	By ImproveScore=By.xpath("//a[contains(text(),'Improve my credit score')]");
	By Apply=By.xpath("//a[contains(text(),'How to Apply for a Credit Card Online')]");
	
	public WebElement CreditCards()
	{
		return driver.findElement(Credit);
	}
	 public WebElement ImproveScore()
	 {
		 return driver.findElement(ImproveScore);
	 }
	 public WebElement Applyonline()
	 {
		 return driver.findElement(Apply);
	 }
}
