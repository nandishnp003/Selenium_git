package listeners;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class runner_class extends base_class
{
	@Test
	public void run()throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("hello");
		Thread.sleep(2000);
		Assert.fail();
		driver.findElement(By.id("pass")).sendKeys("12346");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).submit();
	}

}
