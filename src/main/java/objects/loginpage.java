package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {
	By user= By.cssSelector("#UserName");
	By word= By.cssSelector("#Password");
	By enter=By.cssSelector("input[type=\"submit\"]");

WebDriver driver;
public loginpage(WebDriver driver2) {
	// TODO Auto-generated constructor stub
	this.driver=driver2;
}
public WebElement usersignin()
{
	return driver.findElement(user);
	
}
public WebElement enterpass()
{
	return driver.findElement(word);

}

public WebElement clicklogin()
{
	return driver.findElement(enter);
}
}

