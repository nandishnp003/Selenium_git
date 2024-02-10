package popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class close1 {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","./Softwares/Chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://demoqa.com/browser-windows");
    driver.findElement(By.id("tabButton")).click();
    String p_id = driver.getWindowHandle();
    Set<String> all_id = driver.getWindowHandles();
     int count = all_id.size();
     System.out.println("the count is:"+count);
     all_id.remove(p_id);
     int count1 = all_id.size();
     System.out.println("the count is:"+count1);
     for(String id:all_id);
     {
    	 driver.manage().window().maximize();
    	   Thread.sleep(2000);
    	     driver.close();
     }
  
	}

}
