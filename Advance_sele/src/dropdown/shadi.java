package dropdown;

import java.awt.SystemColor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class shadi {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.shaadi.com/join-now");
	driver.findElement(By.xpath("//div[@class='Dropdown-root'][1]")).click();
	driver.findElement(By.xpath("//div[text()='Man']")).click();
	}

}
