package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginParallelExecution 
{
	@FindBy(id="email")
	private WebElement usn;
	@FindBy(id="pass")
	private WebElement psw;
	@FindBy(name="login")
	private WebElement login;
	
	public LoginParallelExecution(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void Enterusn()
	{
		usn.sendKeys("Admin");
	}
	public void Enterpsw()
	{
		psw.sendKeys("Admin@123");
	}
	public void clicklogin()
	{
		login.click();
	}

}