package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://106.51.87.42:9007/");
		WebElement usn = driver.findElement(By.id("email"));
		usn.sendKeys("Fresher@gmail.com");
		WebElement psw = driver.findElement(By.id("password"));
		psw.sendKeys("Fresher@2024");
		WebElement lgn = driver.findElement(By.xpath("//button[@type='submit']"));
		lgn.click();
		Thread.sleep(4000);
		WebElement ptn = driver.findElement(By.xpath("//span[text()='Patient']"));
		ptn.click();
		Thread.sleep(4000);
		WebElement add = driver.findElement(By.xpath("//button[@class='btn btn-primary pull-right']"));
		add.click();
		WebElement name = driver.findElement(By.xpath("//input[@type='text' and @name='name']"));
		name.sendKeys("Rakshitha");
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("rakshitha@gmail.com");
		WebElement psws=driver.findElement(By.xpath("//input[@type='password']"));
		psws.sendKeys("rakshu@123");
		WebElement sub = driver.findElement(By.xpath("//input[@value='Submit']"));
		sub.click();
	}

}
