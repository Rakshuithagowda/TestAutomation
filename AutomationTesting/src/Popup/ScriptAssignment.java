package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScriptAssignment 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://busonlineticket.com/booking/bus-tickets.aspx");
		Thread.sleep(1000);
		WebElement origin = driver.findElement(By.id("txtOriginGeneral"));
		origin.click();
		driver.findElement(By.xpath("(//div[@class='select2-result-label'])[2]")).click();
		Thread.sleep(1000);
		WebElement dest = driver.findElement(By.id("txtDestinationGeneral"));
		dest.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='select2-result-label'])[3]")).click();
		Thread.sleep(1000);
		WebElement dept = driver.findElement(By.id("txtDepartDateBooking"));
		dept.click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//a[.='20']")).click();
		//Thread.sleep(1000);
		WebElement ret = driver.findElement(By.id("txtReturnDateBooking"));
		ret.click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//a[.='28']")).click();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Search Bus']")).click();
		//Thread.sleep(1000);
		WebElement button = driver.findElement(By.xpath("(//button[.='SELECT'])[1]"));
		button.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//small[.='10C'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//small[.='10B'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//small[.='10A'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//small[.='9A'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//small[.='9B'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//small[.='9C'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//small[.='8C'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@type='button'])[32]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[.='OK']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@type='button'])[32]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//small[.='10C'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//small[.='10B'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//small[.='10A'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//small[.='9A'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//small[.='9B'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//small[.='9C'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//small[.='8C'])[2]")).click();
		Thread.sleep(1000);
		//driver.close();
	}
}
