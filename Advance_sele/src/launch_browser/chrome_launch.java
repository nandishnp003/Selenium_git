package launch_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.GetTitle;

public class chrome_launch 
{
   public static void main(String[] args) throws InterruptedException 
   {
    System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.amazon.in");
    Thread.sleep(3000);
    String title =driver.getTitle();
    System.out.println("the title is;"+ title);
    String Url = driver.getCurrentUrl();
    System.out.println("the url is;"+ Url);
    String psrc =driver.getPageSource();
    System.out.println("the src is;"+ psrc);
    driver.quit();

	}

}
