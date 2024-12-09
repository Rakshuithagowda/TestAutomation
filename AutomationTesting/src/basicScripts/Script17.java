package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script17
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoapps.qspiders.com/ui/button?sublist=0");
		WebElement btn = driver.findElement(By.xpath("//button[@id='btn']"));
		btn.click();
		WebElement btn1 = driver.findElement(By.xpath("//button[@id='btn2']"));
		btn1.click();
		WebElement btn2 = driver.findElement(By.xpath("//button[@id='btn4']"));
		btn2.click();
		WebElement btn3 = driver.findElement(By.xpath("//button[@id='btn5']"));
		btn3.click();
		WebElement btn4 = driver.findElement(By.xpath("//button[@id='btn6']"));
		btn4.click();
		WebElement btn5 = driver.findElement(By.xpath("//button[@id='btn7']"));
		btn5.click();
		WebElement btn6 = driver.findElement(By.xpath("//button[@id='btn8']"));
		btn6.click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
