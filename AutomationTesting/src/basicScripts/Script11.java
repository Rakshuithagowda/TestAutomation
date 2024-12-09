package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script11
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com");
		WebElement ele=driver.findElement(By.id("email"));
		ele.click();
		ele.sendKeys("Rakshitha v gowda");
		WebElement psw=driver.findElement(By.name("pass"));
		psw.click();
		psw.sendKeys("rakshu@123");
		driver.navigate().forward();
		WebElement btn =driver.findElement(By.name("login"));
		btn.click();;
		driver.quit();
		
		
	}

}
