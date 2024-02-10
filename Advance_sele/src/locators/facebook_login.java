package locators;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook_login 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("nandishnp003@gmail.com");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123456789");
	}

}
