package web_element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class count_link11 
{

	public static void main(String[] args) throws InterruptedException
	{
  System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
  WebDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("http://106.51.87.42:9003");
  List<WebElement> links = driver.findElements(By.xpath("//a"));
  int count=links.size();
  Thread.sleep(3000);
  driver.quit();
  System.out.println(count);
	}

}
