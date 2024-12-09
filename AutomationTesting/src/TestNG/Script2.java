package TestNG;

import org.testng.annotations.Test;

public class Script2 
{
	@Test(priority = 0)
	public void signup()
	{
		System.out.println("signup is succesfull");
	}
	@Test(enabled = false)
	public void login()
	{
		System.out.println("login is succesfull");
	}
	@Test(priority = 2)
	public void homepage()
	{
		System.out.println("homepage is succesfull");
	}
	@Test(priority = 3)
	public void logout()
	{
		System.out.println("logout is succesfull");
	}

}
