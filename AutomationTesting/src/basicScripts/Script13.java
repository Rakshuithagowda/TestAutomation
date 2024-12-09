package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script13 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement email =driver.findElement(By.cssSelector("input[type='text']"));
		email.sendKeys("9380774886");
		WebElement psw =driver.findElement(By.cssSelector("input[type='password']"));
		psw.sendKeys("rakshu@123");
		WebElement lgn =driver.findElement(By.cssSelector("button[name='login']"));
		lgn.click();
		driver.quit();
		
		
	}

}
