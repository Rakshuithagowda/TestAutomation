package genericScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseScript 
{
	public WebDriver driver;
	@BeforeMethod

	public void browsersetup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		Thread.sleep(1000);
		 driver= new ChromeDriver();
		 driver.get("https://www.facebook.com");
	}
	@AfterMethod
	public void closebrowser() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.quit();
	}

}
