package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class is_disable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/nandish/Desktop/advvvv/is_enable.html");
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.id("user"));
		boolean b=ele.isDisplayed();
		if(b)
		{
			System.out.print("element is DISABLE");
		}
		else
		{
			System.out.print("element is NOT disable");
		}
		driver.quit();

	}

}
