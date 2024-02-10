package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube_locators {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		   driver.get("https://www.youtube.com/");
		   Thread.sleep(3000);
		   driver.findElement(By.cssSelector("input[id='search']")).sendKeys("kgf song");
		   Thread.sleep(3000);
		   driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
		   Thread.sleep(3000);
		   driver.findElement(By.cssSelector("a[id='video-title']")).click();
		   Thread.sleep(2000);
		   driver.get("close");
		   

	}

}
