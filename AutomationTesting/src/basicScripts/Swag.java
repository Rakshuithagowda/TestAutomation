package basicScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Swag 
{
	public static void main(String[] args) throws IOException, InterruptedException, AWTException 
	{
	
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.saucedemo.com/v1/inventory-item.html?id=4");
		WebElement menu = driver.findElement(By.xpath("//button[.='Open Menu']"));
		menu.click();
		Thread.sleep(1000);
		//WebElement lgnt = driver.findElement(By.xpath("//a[.='Logout']"));
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		//lgnt.click();
		Thread.sleep(1000);
	}

}
