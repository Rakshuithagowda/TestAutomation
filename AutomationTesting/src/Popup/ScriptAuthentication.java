package Popup;

import org.openqa.selenium.chrome.ChromeDriver;

public class ScriptAuthentication 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https:admin:admin@basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/");
		
	}

}
