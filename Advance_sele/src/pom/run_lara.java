package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class run_lara
{
	@Test 
	public void test() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://106.51.87.42:9003/");
		lara_pom lc= new lara_pom(driver);
		lc.loginlink();
		Thread.sleep(500);
		driver.navigate().back();
		lc.signuplink();
		Thread.sleep(500);
		driver.navigate().back();
		lc.search("mobile");   
		lc.location("banglore");  
		lc.Findbtn();
		driver.close();
		
	}

}
