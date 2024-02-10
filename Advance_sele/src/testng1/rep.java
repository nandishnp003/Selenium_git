package testng1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class rep {
	@Test
	public void run()
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Reporter.log("browser launch",true);
		driver.get("https://www.instagram.com");
		Reporter.log("instagram is launch",true);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("123456");
		Reporter.log("valid un is entered",true);
		driver.findElement(By.name("password")).sendKeys("456789");
		Reporter.log("valid pwd is entered",true);
		driver.findElement(By.xpath("//div[text()='Log in']")).submit();
		Reporter.log("clicked on login",true);
		driver.close();
		
	}

}

