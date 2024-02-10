package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class nand {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/nandish/Desktop/advvvv/single_dd.html");
	WebElement dd = driver.findElement(By.id("hotel"));
	Select sel = new Select(dd);
	List<WebElement> opts = sel.getOptions();
	int count = opts.size();
	sel.selectByIndex(2);
	Thread.sleep(3000);
	sel.selectByValue("d");
	Thread.sleep(3000);
	sel.selectByVisibleText("dosa");
	Thread.sleep(3000);
	sel.deselectByIndex(2);
	Thread.sleep(3000);
	sel.deselectByValue("d");
	Thread.sleep(3000);
	sel.deselectByVisibleText("dosa");
	
	

	}

}
