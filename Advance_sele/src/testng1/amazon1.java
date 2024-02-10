package testng1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.annotations.Test;

public class amazon1 
{
	@Test
	public void amazon()
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("samsung mobile",Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='Samsung Galaxy A23 5G, Light Blue (6GB, 128GB Storage) with Offer']")).click();
	}

}
