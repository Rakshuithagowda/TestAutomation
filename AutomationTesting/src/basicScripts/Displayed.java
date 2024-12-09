package basicScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Displayed
{
	public static void main(String[] args) throws IOException 
	{
	
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement usn = driver.findElement(By.id("email"));
		WebElement psw=driver.findElement(By.id("pass"));
		WebElement lgn=driver.findElement(By.name("login"));
		if(usn.isDisplayed())
		{
			if(usn.isEnabled())
			{
				usn.sendKeys("QSpider");
			}
			else
			{
				System.out.println("it is not enabled");
			}
		}
		else
		{
			System.out.println("it is not enabled");
		}
		if(psw.isDisplayed())
		{
			if(psw.isEnabled())
			{
				psw.sendKeys("Rajajinagr");
			}
			else
			{
				System.out.println("it is not enabled");
			}
		}
		else
		{
			System.out.println("its is not dispalyed");
		}
		if(lgn.isDisplayed())
		{
			if(lgn.isEnabled())
			{
				lgn.click();
			}
			else
			{
				System.out.println("It is not enabled");
			}
		}
		else
		{
			System.out.println("it is no displayed");
		}
		
	}
}
