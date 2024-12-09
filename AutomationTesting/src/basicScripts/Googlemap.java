package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlemap
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/maps/@12.9989812,77.5504667,15z?entry=ttu&g_ep=EgoyMDI0MTAxNC4wIKXMDSoASAFQAw%3D%3D");
		WebElement search =driver.findElement(By.xpath("//button[@id='hArJGc']"));
		Thread.sleep(2000);
		search.click();
		Thread.sleep(2000);
		WebElement src = driver.findElement(By.cssSelector(""));
		Thread.sleep(2000);
		src.sendKeys("Rajajinagar, Bengaluru, Karnataka");
		Thread.sleep(2000);
		WebElement des = driver.findElement(By.xpath("//*[@id=\"sb_ifc50\"]/input"));
		des.sendKeys("Basavanagudi");
	}

}
