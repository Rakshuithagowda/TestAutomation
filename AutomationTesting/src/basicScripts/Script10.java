package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script10
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/New%20folder/link123.html");
		WebElement ele =driver.findElement(By.id("t1"));
		ele.click();
		ele.sendKeys("QSpiders");
		WebElement psw=driver.findElement(By.name("n1"));
		psw.click();
		psw.sendKeys("Admin@123");
	
		
	}

}
