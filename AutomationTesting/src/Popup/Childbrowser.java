package Popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowser
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/scroll?scenario=1");
		WebElement ele = driver.findElement(By.xpath("//a[.='Open In New Tab']"));
		Set<String> wins = driver.getWindowHandles();
		ArrayList<String> arr=new ArrayList<String>(wins);
		int count = wins.size();
		for(int i=0;i<count;i++)
		{
			String win = arr.get(i);
			driver.switchTo().window(win);
			String tit = driver.getTitle();
			System.out.println(tit);
			if(win.equals(wins))
			{
				driver.close();
			}
		}
	}

}
