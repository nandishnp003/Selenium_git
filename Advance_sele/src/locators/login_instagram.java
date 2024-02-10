package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_instagram {
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com");
	Thread.sleep(6000);
	driver.findElement(By.name("username")).sendKeys("nandhu");
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("selenium");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector("#loginForm > div > div:nth-child(3) > button > div")).click();
	}

}
