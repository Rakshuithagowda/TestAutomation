package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggyScript 
{
	public static void main(String[]args)
		{
			System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.swiggy.com/");
			WebElement search = driver.findElement(By.xpath("//span[text()='Search']"));
			search.click();
			WebElement bar=driver.findElement(By.xpath("//input[@placeholder='Search for restaurants and food']"));
			bar.sendKeys("biriyani");

		}
	
	

}
