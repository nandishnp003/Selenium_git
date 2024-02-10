package testng1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class facebook {
	@Test
	public void npp()
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("email")).sendKeys("11111");
		driver.findElement(By.name("pass")).sendKeys("23456");
		driver.findElement(By.xpath("//button[text()='Log in']")).submit();
	}

}
