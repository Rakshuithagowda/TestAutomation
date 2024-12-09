package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptHidden 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/?gad_source=1&gclid=EAIaIQobChMIrIS46PPniQMV_KNmAh1CuCdNEAAYASAAEgK2Z_D_BwE");
	 driver.findElement(By.xpath("//span[.='Date']")).click();
		driver.findElement(By.xpath("//span[.='21']")).click();
	}


}
