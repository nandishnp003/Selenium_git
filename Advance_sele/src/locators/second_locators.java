package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

public class second_locators 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/nandish/Desktop/advvvv/sec1.html");
		Thread.sleep(2000);
		driver.findElement(By.id("fb")).click();
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
		driver.close();

	}

}
