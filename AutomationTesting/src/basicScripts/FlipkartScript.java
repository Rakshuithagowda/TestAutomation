package basicScripts;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartScript 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Set<String> wins = driver.getWindowHandles();
		String parent = driver.getWindowHandle();
		driver.navigate().to("https://www.flipkart.com/");
		
		WebElement search = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		search.sendKeys("Iphone11");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//img[@loading='eager']")).click();
		Thread.sleep(1000);
		for(String win:wins) 
		{
			if(!win.equals(parent))
			{
			driver.switchTo().window(win);
			}
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[.='Add to cart']")).click();
	}
	
}