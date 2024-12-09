package Popup;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
	
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
		Thread.sleep(2000);
		WebElement btn = driver.findElement(By.xpath("//button[.='Prompt Alert Box']"));
		Thread.sleep(1000);
		btn.click();
		Thread.sleep(1000);
		Alert popup=driver.switchTo().alert();
		Thread.sleep(1000);
		popup.sendKeys("yes");
		Thread.sleep(1000);
		popup.accept();
	}

}
