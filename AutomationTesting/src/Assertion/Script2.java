package Assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Script2 
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
		SoftAssert s=new SoftAssert();
		s.assertEquals(expected, Actualresult);
		System.out.println(Actualresult);
		driver.close();
		s.assertAll();
		
	}


}
