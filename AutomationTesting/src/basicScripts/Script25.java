package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script25 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		Thread.sleep(2000);
		Thread.sleep(2000);
		WebElement f1 = driver.findElement(By.xpath("(//iframe)[1]"));
		driver.switchTo().frame(f1);
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		Thread.sleep(2000);
		email.sendKeys("rakshu@gmail.com");
		WebElement psw = driver.findElement(By.xpath("//input[@type='password']"));
		psw.sendKeys("admin@123");
		WebElement cpsw = driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		cpsw.sendKeys("admin@123");
		driver.switchTo().defaultContent();
		WebElement f2 = driver.findElement(By.xpath("(//iframe)[2]"));
		driver.switchTo().frame(f2);
		WebElement usn=driver.findElement(By.xpath("//input[@name='username']"));
		usn.sendKeys("Qspider");
		WebElement psw1 = driver.findElement(By.xpath("//input[@name='password']"));
		psw1.sendKeys("Admin@123");
		}

}
