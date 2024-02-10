package mouse_actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class open_multiple_tabs {

	public static void main(String[] args) throws AWTException, InterruptedException {
  System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
  WebDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  Robot n=new Robot();
  Thread.sleep(2000);
  for(int i=1;i<=5;i++)
  {
	  n.keyPress(KeyEvent.VK_CONTROL);
	  n.keyPress(KeyEvent.VK_T);
	  n.keyRelease(KeyEvent.VK_CONTROL);
	  n.keyRelease(KeyEvent.VK_T);
	  Thread.sleep(2000);
  }

	}

}
