package web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.html5.GetLocationContext;

public class loc_ation {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com");
	Point loc = driver.findElement(By.xpath("//input[@name='username']")).getLocation();
	System.out.println(loc);
	int x=loc.getX();
	int y=loc.getY();
	driver.quit();
	System.out.println("the value x is:" + x);
	System.out.println("the value y is:" + y);


	}

}
