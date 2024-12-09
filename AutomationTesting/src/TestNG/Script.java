package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script
{
	@Test
	public void Testcase()
	{
		Reporter.log("Hello",true);
	}
	@Test
	public void Testcase1()
	{
		Reporter.log("Good Morning",true);
	}


}
