package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class run_insta1 
{
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares.chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www/instagram.com");
		pom_insta1 in= new pom_insta1(driver);
		in.un_Txt("123"); 
		in.pwd_Txt("456");
		in.login_Btn();
				
	}

}

