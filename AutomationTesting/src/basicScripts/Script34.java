package basicScripts;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Script34 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Rakshitha/Pictures/Screenshots/dropdown.html");
		WebElement dd = driver.findElement(By.id("celabraties"));
		Select s=new Select(dd);
		if(s.isMultiple())
		{
			s.selectByIndex(0);
			Thread.sleep(2000);
			s.selectByValue("k");
			Thread.sleep(2000);
			s.selectByVisibleText("kohli");
			Thread.sleep(2000);
			s.deselectAll();	
			//Thread.sleep(2000);
			//s.deselectByIndex(0);
			//Thread.sleep(2000);
			//s.deselectByValue("k");
			//Thread.sleep(2000);
			//s.deselectByVisibleText("kohli");
		}
		
	}

}
