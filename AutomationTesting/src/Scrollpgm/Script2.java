package Scrollpgm;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script2 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/scroll/newTabHorizontal");
		WebElement link = driver.findElement(By.xpath("//a[.='Facebook']"));
		Thread.sleep(1000);
		Point loc = link.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(1000);
		js.executeScript("window.scrollBy("+x+" ,"+y+")");
		//System.out.println(x);
		//System.out.println(y);
		link.click();
		Thread.sleep(1000);
		driver.close();
	}



}
