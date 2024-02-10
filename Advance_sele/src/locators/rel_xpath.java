package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rel_xpath {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/nandish/Desktop/advvvv/abs_xpath.html");
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//input")).sendKeys("hello");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a")).click();

	}

}
