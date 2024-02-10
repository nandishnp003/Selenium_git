package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clear
{

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("file:///C:/Users/nandish/Desktop/advvvv/clear.html");
	WebElement ele = driver.findElement(By.id("user"));
	ele.sendKeys(Keys.CONTROL+"a");
	ele.sendKeys(Keys.BACK_SPACE);

	}

}
