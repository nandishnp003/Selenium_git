package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram_login {
	public static void main(String[] args) throws InterruptedException {
   System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.get("https://www.instagram.com");
   Thread.sleep(5000);
   driver.findElement(By.cssSelector("input[type='text']")).sendKeys("yamuna");
   Thread.sleep(3000);
   driver.findElement(By.cssSelector("input[type='password']")).sendKeys("passwords");
  Thread.sleep(3000);
   driver.findElement(By.cssSelector("button[type='submit']")).click();

	}

}
