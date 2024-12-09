package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script15
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com");
		WebElement src=driver.findElement(By.cssSelector("input[type=text]"));
		src.sendKeys("kannada songs");
		WebElement ele = driver.findElement(By.cssSelector("button[id='search-icon-legacy']"));
		ele.click();
		WebElement song=driver.findElement(By.cssSelector("video[class='video-stream html5-main-video']"));
		song.click();
	}

}
