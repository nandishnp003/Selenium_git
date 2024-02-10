package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class double_click {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	WebElement dclick = driver.findElement(By.xpath("//button [text()='Double-Click Me To See Alert']"));
	Thread.sleep(2000);
	Actions act=new Actions(driver);
	act.doubleClick(dclick).perform();
	}

}
