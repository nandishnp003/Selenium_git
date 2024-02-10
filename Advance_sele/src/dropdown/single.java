package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class single 
{
 public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/nandish/Desktop/advvvv/single_dd.html");
	WebElement np = driver.findElement(By.id("hotel"));
	Select sel = new Select(np);
	boolean b = sel.isMultiple();
	if(b)
	{
		System.out.println("it is single dd");
	}
	else
	{
		System.out.println("it is multiple dd");
	}
	
	}

}
