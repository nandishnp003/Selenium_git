package web_element;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class chec_boxes 
{

	public static void main(String[] args) 
	{
    System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("file:///C:/Users/nandish/Desktop/advvvv/is_selected.html");
    List<WebElement> chbox = driver.findElements(By.xpath("//input"));
    int count = chbox.size();
    driver.quit();
    System.out.println(count);
    

	}

}
