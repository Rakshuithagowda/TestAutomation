package PracticeScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int count = links.size();
		for(int i=0;i<count;i++)
		{
			WebElement link = links.get(i);
			String url = link.getText();
			System.out.println(url);
		}
		Thread.sleep(1000);
		driver.quit();
		
		
	}

}