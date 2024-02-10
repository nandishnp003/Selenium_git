package syncronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class implicitwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/progress/timer?sublist=2");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@placeholder='Enter time in seconds']")).sendKeys("10");
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		WebElement ele = driver.findElement(By.xpath("//section[@class='py-3 border-t-[1px]']/select"));
		Select sel = new Select(ele);
		sel.selectByIndex(0);
	}

}
