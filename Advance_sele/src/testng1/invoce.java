package testng1;

import org.testng.annotations.Test;

public class invoce 
{
	@Test(invocationCount = 0)
	public void compose()
	{
		System.out.println("mail is composed");
	}
   @Test(invocationCount = 5)
   public void sentitems()
   {
	   System.out.println("mail is present in sent items");
   }
}
