package basicScripts;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonScript 
{

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("wrist watch for men");
		WebElement btn = driver.findElement(By.id("nav-search-submit-button"));
		btn.click();
		Thread.sleep(1000);
		WebElement leather = driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[9]"));
		leather.click();
		
	}
}
