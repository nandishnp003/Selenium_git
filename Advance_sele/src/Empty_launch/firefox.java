package Empty_launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox
{
	public static void main(String[] args) throws InterruptedException
	{
		String key="webdriver.gecko.driver";
		String value="./Softwares/geckodriver.exe";
		System.setProperty(key, value);
		FirefoxDriver driver =new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com");
        Thread.sleep(5000);
        WebElement number=driver.findElement(By.cssSelector("input._18u87m _3WuvDp['autocomplete=off']"));
        number.sendKeys("8296043856");
	}

}
