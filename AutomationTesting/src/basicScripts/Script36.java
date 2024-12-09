package basicScripts;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Script36
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Rakshitha/Pictures/Screenshots/dropdown.html");
		WebElement dd = driver.findElement(By.id("celabraties"));
		Select s=new Select(dd);
		List<WebElement> option = s.getOptions();
		int optscount = option.size();
		System.out.println(optscount);
		ArrayList<String> arr=new ArrayList<String>();
		for(int i=0;i<optscount;i++)
		{
			WebElement opt = option.get(i);
			String txt = opt.getText();
			arr.add(txt);
			//System.out.println(txt);
		}
		
		Collections.sort(arr,Collections.reverseOrder());
		for(String ar:arr)
		{
			System.out.println(ar);
		}
		driver.close();
	}

}
