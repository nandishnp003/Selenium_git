package locators;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb_xpath_login {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	Thread.sleep(5000);
	//driver.findElement(By.xpath("//input[@type='text' and@ placeholder='Email address or phone number']")).sendKeys("123456789");
	//Thread.sleep(2000);
	//driver.findElement(By.xpath("//input[@type='password' and @ aria-label='Password']")).sendKeys("nandish");
	//Thread.sleep(2000);
	//driver.findElement(By.xpath("//button[@name='login' and@type='submit']")).click();
     driver.findElement(By.xpath("//a[text()='Create new account']")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@type='text' and @ placeholder='First name']")).sendKeys("qwertyui");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@type='text' and @ aria-label='Mobile number or email address']")).sendKeys("7894561230");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//input[@type='password' and @ aria-label='New password']")).sendKeys("123654789");
     Thread.sleep(2000);
     driver.findElement(By.xpath("//label[text()='Male']")).click();
     Thread.sleep(2000);
     driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
     //driver.findElement(By.xpath("//button[@type='submit' and @ name='websubmit']"))
     
	}

}
