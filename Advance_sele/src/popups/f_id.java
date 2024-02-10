package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class f_id 
{

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","./Softwares/Chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/browser-windows");
	driver.findElement(By.id("tabButton")).click();
	String p_id = driver.getWindowHandle();
	System.out.println(p_id);
	}

}
