package testng1;

import org.testng.annotations.Test;

public class depends 
{
	@Test
	public void compose()
	{
		System.out.println("mail is composed");
	}
	@Test(dependsOnMethods = "compose")
	public void sentitems()
	{
		System.out.println("mail is sentitem");
	}
	@Test(dependsOnMethods = "sentitems")
	public void trash()
	{
		System.out.println("mail is present in trash");
	}
	

}
