package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuploadscript 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Rakshitha/Desktop/file.html");
		WebElement file = driver.findElement(By.id("a1"));
		file.sendKeys("D:\\Resume\\Rakshitha .pdf");
		
	}

}
