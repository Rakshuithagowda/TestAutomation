package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Script32 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
		WebElement src = driver.findElement(By.id("box5"));
		WebElement des = driver.findElement(By.id("box105"));
		WebElement src1 = driver.findElement(By.id("box6"));
		WebElement des1 = driver.findElement(By.id("box106"));
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		a.dragAndDrop(src, des).perform();
		Thread.sleep(2000);
		a.dragAndDrop(src1, des1).perform();

	}
}
