package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class first_locators 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/nandish/Desktop/advvvv/nnp.html");
		Thread.sleep(5000);
		driver.findElement(By.tagName("a")).click();
		Thread.sleep(5000);
		driver.close();
    }

}
