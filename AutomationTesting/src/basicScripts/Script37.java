package basicScripts;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Script37 
{

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		WebElement option = driver.findElement(By.id("select-multiple-native"));
		WebElement button = driver.findElement(By.xpath("//button[.='Add']"));
		Select s=new Select(option);
		//if(s.isMultiple())
		{
			s.selectByValue("Running Shoes");
			s.selectByValue("Winter Coat");
			s.selectByValue("Casual Pants");
			s.selectByValue("Formal Shoes");
			s.selectByValue("Leather Jacket");
		}
		button.click();
		
	}
}
