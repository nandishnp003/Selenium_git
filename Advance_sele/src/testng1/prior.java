package testng1;

import org.testng.annotations.Test;

public class prior 
{
	@Test(priority = 2)
	public void compose()
	{
		System.out.println("mail is composed");
	}
	@Test(priority = 1)
	public void sentitems()
	{
		System.out.println("mail is sentitem");
	}
	@Test(priority = 3)
	public void trash()
	{
		System.out.println("mail is present in trash");
	}
	

}

