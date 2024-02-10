package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flip_xpath {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.get("https://www.flipkart.com");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@type=\"text\"]")).click();

	}

}
