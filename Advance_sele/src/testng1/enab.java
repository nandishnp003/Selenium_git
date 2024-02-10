package testng1;

import org.testng.annotations.Test;

public class enab
{
	@Test(enabled = true)
	public void compose()
	{
		System.out.println("mail is composed");
	}
	@Test(enabled = false)
	public void sentitems()
	{
		System.out.println("mail is sentitem");
	}
	@Test(enabled = true)
	public void trash()
	{
		System.out.println("mail is present in trash");
	}
	

}
