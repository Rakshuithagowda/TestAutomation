package basicScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ChildBrowserassignment 
{

	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		WebElement link1 = driver.findElement(By.xpath("(//a[@class='card-link'])[1]"));
		WebElement link2 = driver.findElement(By.xpath("(//a[@class='card-link'])[4]"));
		WebElement link3 = driver.findElement(By.xpath("(//a[@class='card-link'])[10]"));
		WebElement link4 = driver.findElement(By.xpath("(//a[@class='card-link'])[13]"));
		Actions a= new Actions(driver);
		Robot r=new Robot();
		ArrayList<WebElement> arr=new ArrayList<WebElement>();
		arr.add(link1);
		arr.add(link2);
		arr.add(link3);
		arr.add(link4);
		for(int i=0;i<4;i++)
		{
			WebElement win = arr.get(i);
			a.contextClick(win).perform();
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
		}
		Set<String> wins = driver.getWindowHandles();
		for(String win:wins)
		{
			WebDriver wh = driver.switchTo().window(win);
			Thread.sleep(2000);
			String title = wh.getTitle();
			System.out.println(title);
			Thread.sleep(1000);
			driver.close();
		}
	}
		
	}

