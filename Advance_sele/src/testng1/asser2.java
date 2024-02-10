package testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class asser2
{
	@Test
	public void asser() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	String js= driver.getCurrentUrl();
	Assert.assertEquals(js,"https://www.instagram.com/");
	driver.findElement(By.name("email")).sendKeys("123456");
	}
}
