package mouse_actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class close_browser {

	public static void main(String[] args) throws AWTException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Robot m=new Robot();
	Thread.sleep(2000);
	m.keyPress(KeyEvent.VK_ALT);
	m.keyPress(KeyEvent.VK_F4);
	m.keyRelease(KeyEvent.VK_ALT);
	m.keyRelease(KeyEvent.VK_F4);

	}

}
