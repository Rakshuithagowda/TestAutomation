package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script1 
{
	@Test(invocationCount = 2)
	public void testcase2()
	{
		Reporter.log("Hiii",true);
	}
	@Test(invocationCount = 0)
	public void testcase3()
	{
		Reporter.log("Good Afternoon",true);
	}

}
