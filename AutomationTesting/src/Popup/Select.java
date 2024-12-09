package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Select 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.busonlineticket.com/booking/cameron-highlands-to-penang-bus-tickets");
		Thread.sleep(1000);
		WebElement button = driver.findElement(By.xpath("(//button[.='SELECT'])[1]"));
		button.click();
		//WebElement button = driver.findElement(By.xpath("(//button[.='SELECT'])[1]"));
		//button.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//small[.='10C'])[2]")).click();
		driver.findElement(By.xpath("(//small[.='10B'])[2]")).click();
		driver.findElement(By.xpath("(//small[.='10A'])[2]")).click();
		driver.findElement(By.xpath("(//small[.='9A'])[2]")).click();
		driver.findElement(By.xpath("(//small[.='9B'])[2]")).click();
		driver.findElement(By.xpath("(//small[.='9C'])[2]")).click();
		
	
	
	
	
	
	
	
	
	}
	
}
