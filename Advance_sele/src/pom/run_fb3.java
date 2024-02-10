package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class run_fb3 
{
	@Test
	public void run()
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		pom_fb3 p=new pom_fb3(driver);
		p.getun().sendKeys("hi");
		driver.navigate().refresh();
		p.getun().sendKeys("hello");
	}

}
	


