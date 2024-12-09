package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Scriptpractice 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.facebook.com");
		WebDriverWait we=new WebDriverWait(driver, 10);
		we.until(ExpectedConditions.titleContains("Facebook"));
		String title = driver.getTitle();
		System.out.println(title);
		we.until(ExpectedConditions.urlContains("facebook"));
		String url = driver.getCurrentUrl();
		System.out.println(url);
		//Thread.sleep(2000);
		driver.close();
		
		
	}

}
