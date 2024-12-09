package basicScripts;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Script35 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		WebElement dd = driver.findElement(By.id("month"));
		Select s=new Select(dd);
		List<WebElement> month = s.getOptions();
		int list = month.size();
		System.out.println(list);
		ArrayList<String> arr=new ArrayList<String>();
		for(int i=0;i<list;i++)
		{
			WebElement list1 = month.get(i);
			String txt = list1.getText();
			arr.add(txt);
			//System.out.println(txt);
		}
		Collections.sort(arr,Collections.reverseOrder());
		for(String ar:arr)
		{
			System.out.println(ar);
		}
		driver.quit();
		
	}

}
