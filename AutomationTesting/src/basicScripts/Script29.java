package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script29 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Rakshitha/Desktop/text.html");
		List<WebElement> txt = driver.findElements(By.xpath("//input[@type='text']"));
		int count=txt.size();
		for(int i=0;i<count;i++)
		{
			if(i%2==0)
			{
				WebElement cli = txt.get(i);
				cli.clear();
			}
		}
		Thread.sleep(2000);
		for(int i=count-1;i>=0;i--)
		{
			if(i%2==0)
			{
				WebElement cli1=txt.get(i);
				//System.out.println("text1");
				cli1.clear();
			}
		}
		driver.quit();
	}
}
