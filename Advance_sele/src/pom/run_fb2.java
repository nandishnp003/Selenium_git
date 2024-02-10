package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class run_fb2 
{
	@Test
	public void run()
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		pom_fb2 p=new pom_fb2(driver);
		p.getun("hi");
		driver.navigate().refresh();
		p.getun("hello");
	}

}


