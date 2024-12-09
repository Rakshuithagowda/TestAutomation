package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class script14
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		WebElement usn = driver.findElement(By.xpath("//input[@placeholder='Enter your name']"));
		usn.sendKeys("Rakshitha");
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("rakshitha@gmail.com");
		WebElement psw = driver.findElement(By.xpath("//input[@id='password']"));
		psw.sendKeys("rakshu@123");
		WebElement btn = driver.findElement(By.xpath("//button[@type='submit']"));
		btn.click();
		Thread.sleep(1000);
		driver.quit();
		
		
		
	}

}
