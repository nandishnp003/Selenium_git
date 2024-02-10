package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class third_locators {
	
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/nandish/Desktop/advvvv/name.html");
	Thread.sleep(5000);
	driver.findElement(By.name("google")).click();
	Thread.sleep(2000);
	driver.close();

	}

}
