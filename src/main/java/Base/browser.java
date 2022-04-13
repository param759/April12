package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browser {
 public WebDriver driver;
 public Properties prep;
	@SuppressWarnings("deprecation")
	public WebDriver callbrowser() throws IOException
	{
		Properties prep=new Properties();
		FileInputStream Fis=new FileInputStream("C:\\Users\\15199\\eclipse-workspace\\March27\\src\\main\\java\\Base\\initial.properties");
		prep.load(Fis);
		//String page=prep.getProperty("url");
		String browsername=prep.getProperty("browser");
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\15199\\Desktop\\latestchrome\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	
	}
}
