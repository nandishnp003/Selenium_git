package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ClickElement;

import mouse_actions.click_hold;
import mouse_actions.right_click;

public class hidden_pops {

	public static void main(String[] args) throws InterruptedException {
   System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
   Thread.sleep(2000);
   driver.get("https://demoqa.com/automation-practice-form");
   driver.findElement(By.id("dateOfBirthInput")).click();
   driver.findElement(By.xpath("//div[text()='30']")).click();

	}

}
