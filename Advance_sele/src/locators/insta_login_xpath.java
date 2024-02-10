package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class insta_login_xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@ aria-label='Phone number, username, or email' and @ type='text']")).sendKeys("123456789");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[type='Password']")).sendKeys("123456");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
        Thread.sleep(5000);

	}

}
