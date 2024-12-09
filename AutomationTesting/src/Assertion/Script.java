package Assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Script 
{
	@Test
	public void testcase()
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		String expected="Facebook – log in or sign up";
		String Actualresult = driver.getTitle();
		Assert.assertEquals(expected, Actualresult);
		System.out.println(Actualresult);
		driver.close();
		
	}

}
