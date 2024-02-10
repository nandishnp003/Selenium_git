package testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class myntra_soft_asser 
{
	@Test
	public void asserts() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		String fsize = driver.findElement(By.xpath("//span[text()='facebookIcon landingSprite']")).getCssValue("font-size");
		SoftAssert s=new SoftAssert();
		s.assertEquals(fsize,"AbC");
		driver.findElement(By.name("email")).sendKeys("123456");
		s.assertAll();
		driver.close();
	}
}
