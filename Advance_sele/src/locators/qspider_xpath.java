package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class qspider_xpath {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoapps.qspiders.com");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@ type='email' and @placeholder='Enter your email']")).sendKeys("nandishnp003@gmail.com");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@ name='name' and @placeholder='Enter your name']")).sendKeys("nandish");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@ id='password' and @placeholder='Enter your password']")).sendKeys("123456");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[ text()='Register']")).click();
    Thread.sleep(5000);
	}

}
