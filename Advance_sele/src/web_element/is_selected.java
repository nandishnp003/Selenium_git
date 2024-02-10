package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_selected 
{

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/nandish/Desktop/advvvv/is_selected.html");
	Thread.sleep(3000);
	WebElement ele = driver.findElement(By.id("user"));
	boolean b=ele.isEnabled();
	if(b)
	{
		System.out.print("element is selected");
	}
	else
	{
		System.out.print(" not selected");
	}
	driver.quit();
	}

}
