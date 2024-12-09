package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Script3 
{
		@Test
		public void signup()
		{
			System.out.println("signup is succesfull");
		}
		@Test(dependsOnMethods = "signup")
		public void login()
		{
	
			System.out.println("login is succesfull");
		}
		@Test(dependsOnMethods = "login")
		public void homepage()
		{
			System.out.println("homepage is succesfull");
		}
		@Test(dependsOnMethods = "homepage")
		public void logout()
		{
			System.out.println("logout is succesfull");
		}

	}



