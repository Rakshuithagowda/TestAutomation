package TestNGFramework;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestScript1 extends GenericScript
{
	@Test
	public void usn1() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("admin2123");
		Thread.sleep(1000);
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(1000);
	}

}
