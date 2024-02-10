
package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon_search 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		   driver.get("https://www.amazon.com/");
		   Thread.sleep(3000);
		   driver.findElement(By.cssSelector("input[type='text']")).sendKeys("samsung galaxy s23 ultra");
		   Thread.sleep(3000);
		   driver.findElement(By.cssSelector("input[id='nav-search-submit-button']")).click();
		   Thread.sleep(3000);
		   driver.findElement(By.cssSelector("a[class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']")).click();
           Thread.sleep(3000);
           driver.findElement(By.cssSelector("input[type='submit']")).click();

	}

}
