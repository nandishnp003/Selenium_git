package locators;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpaths
{

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.navigate().to("https://www.flipkart.com");
	 Thread.sleep(5000);
	driver.navigate().back();
	 Thread.sleep(3000);
	driver.navigate().forward();
	 Thread.sleep(2000);
	driver.navigate().refresh();
	 Thread.sleep(2000);
	driver.manage().window().maximize();
	 Dimension d = new org.openqa.selenium.Dimension(500,550);
    Thread.sleep(3000);
    Point p = new Point(200,150);
    driver.manage().window().setPosition(p);
	}

}
