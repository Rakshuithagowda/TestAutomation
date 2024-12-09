package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script22 
{
	
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/New%20folder/mainpage.html");
		WebElement usn = driver.findElement(By.xpath("//input[@type='text']"));
		usn.sendKeys("Admin");
		//driver.switchTo().frame(0);
		driver.switchTo().frame("f1");
		 //WebElement fr = driver.findElement(By.xpath("//iframe[@id='f1']"));
		// driver.switchTo().frame(fr);
		 WebElement psw = driver.findElement(By.xpath("//input[@type='text']"));
		 psw.sendKeys("admin@123");
	}
}


















