package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class click_hold {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoapps.qspiders.com/clickHold?scenario=1&sublist=0");
driver.manage().window().maximize();
         WebElement ele = driver.findElement(By.id("circle"));

	}

}
