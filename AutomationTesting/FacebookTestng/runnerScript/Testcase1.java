package runnerScript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genericScripts.BaseScript;
import pageObject.Loginpage;

public class Testcase1 extends BaseScript
{
	@Test
	public void login() throws InterruptedException
	{
		Loginpage lgn=new Loginpage(driver);
		lgn.Enterusn();
		lgn.Enterpsw();
		driver.navigate().refresh();
		Thread.sleep(2000);
		lgn.Enterusn();
		lgn.Enterpsw();
		lgn.clicklogin();
		
	}

}
