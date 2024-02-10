package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class file_upload {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.get("file:///C:/Users/nandish/Desktop/advvvv/file_upload.html");
	Thread.sleep(3000);
	driver.findElement(By.id('uploadfile')).SendKeys("\"C:\\Users\\nandish\\Desktop\\TEST SCENARIOS.txt\\"");

	}

}
