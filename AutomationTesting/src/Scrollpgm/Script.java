package Scrollpgm;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		JavascriptExecutor js=(JavascriptExecutor)driver;
	
		for(int i=0;i<3;i++)
		{
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		}
		for(int i=0;i<3;i++)
		{
		js.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(2000);
		}
		
	}

}
