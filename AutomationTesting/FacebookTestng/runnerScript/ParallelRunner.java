package runnerScript;

import org.testng.annotations.Test;

import basicScripts.Script;
import pageObject.LoginParallelExecution;

public class ParallelRunner extends genericScripts.Script
{
	@Test
	public void login1() throws InterruptedException
	{
		LoginParallelExecution lp=new LoginParallelExecution(driver);
		lp.Enterusn();
		lp.Enterpsw();
		Thread.sleep(2000);
		lp.clicklogin();
	}

}
