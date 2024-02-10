package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class alert {

	public static void main(String[] args) {
   System.setProperty("webdriver.chrome.driver","./Softwares.chomedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://demo.guru99.com/test/delete_customer.php");
   driver.findElement(By.name=('cusid')).SendKeys("123456789",Keys.ENTER);
   Alert alt=driver.switchTo().alert();
   String txt=alt.getText();
System.out.println(txt);
alt.accept();	}

}
