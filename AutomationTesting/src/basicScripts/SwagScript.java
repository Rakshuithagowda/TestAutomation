package basicScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwagScript 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
	
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.saucedemo.com/v1/");
		WebElement usn = driver.findElement(By.id("user-name"));
		usn.sendKeys("standard_user");
		WebElement psw = driver.findElement(By.id("password"));
		psw.sendKeys("secret_sauce");
		WebElement btn = driver.findElement(By.id("login-button"));
		btn.click();
		Thread.sleep(2000);
		//WebElement option = driver.findElement(By.xpath("(//div[@class='inventory_item_label'])[1]"));
		//String text = option.getText();
		//System.out.println(text);
		WebElement option = driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']"));
		String text = option.getText();
		System.out.println(text);
		WebElement price = driver.findElement(By.xpath("(//div[@class='inventory_item_price'])[1]"));
		String value = price.getText();
		String symbol1 = value.toString().replace("$" ," ");
		System.out.println(symbol1);
		WebElement product = driver.findElement(By.xpath("(//img[@class='inventory_item_img'])[1]"));
		product.click();
		WebElement prdt1 = driver.findElement(By.xpath("//div[.='Sauce Labs Backpack']"));
		String text1 = prdt1.getText();
		System.out.println(text1);
		Thread.sleep(2000);
		WebElement price1 = driver.findElement(By.xpath("//div[@class='inventory_details_price']"));
		String value1 = price1.getText();
		String symbol = value1.toString().replace("$" , " ");
		System.out.println(symbol);
		Thread.sleep(1000);
		WebElement cart = driver.findElement(By.xpath("//button[.='ADD TO CART']"));
		cart.click();
		Thread.sleep(1000);
		WebElement menu = driver.findElement(By.xpath("//button[.='Open Menu']"));
		menu.click();
		Thread.sleep(1000);
		if(symbol1==symbol)
		{
			System.out.println("Same price");
		}
		else
		{
			System.out.println("not a Same price");
		}
		Thread.sleep(1000);
		WebElement lgnt = driver.findElement(By.xpath("//a[.='Logout']"));
		lgnt.click();
		
		Thread.sleep(1000);
		
		
		
		
		driver.close();
		
		
		
		
		
		
		
		
		}

}
