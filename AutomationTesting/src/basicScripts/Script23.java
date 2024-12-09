package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script23 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/New%20folder/Frame4.html");
		WebElement usn = driver.findElement(By.xpath("//input[@type='text']"));
		usn.sendKeys("Admin");
		driver.switchTo().frame("f1");
		WebElement psw = driver.findElement(By.xpath("//input[@type='text']"));
		psw.sendKeys("Admin@113");
		driver.switchTo().frame(0);
		WebElement mob = driver.findElement(By.xpath("//input[@type='text']"));
		mob.sendKeys("255418520532");
		driver.switchTo().frame(0);
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("rakhu@gmail.com");
		email.clear();
		driver.switchTo().parentFrame();
		mob.clear();
		driver.switchTo().defaultContent();
		usn.clear();		
	}

}
