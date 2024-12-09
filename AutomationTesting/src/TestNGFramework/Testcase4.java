package TestNGFramework;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Testcase4 extends GenericScript
{
	@Test
	public void button()
	{
		boolean displayed = driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
		boolean enabled = driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
		System.out.println(displayed + " " + enabled);
	}
	

}
