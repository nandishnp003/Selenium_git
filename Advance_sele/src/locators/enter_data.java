package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class enter_data
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/nandish/Desktop/advvvv/ENTER.html");
		Thread.sleep(5000);
		driver.findElement(By.name("user")).sendKeys("nandish");
		Thread.sleep(2000);
		driver.close();

	}

}
