package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class run_fb1 
{
	@Test
	public void run()
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		pom_fb1 p=new pom_fb1(driver);
		p.getUn();
		driver.navigate().refresh();
		p.getUn();
	}

}
