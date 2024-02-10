package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtub_xpath {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Intandam");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Inthandham Video Song - Sita Ramam (Telugu) | Dulquer | Mrunal | Vishal | Hanu Raghavapudi']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html[1]/body[1]/ytd-app[1]/div[1]/ytd-page-manager[1]/ytd-watch-flexy[1]/div[5]/div[1]/div[1]/div[2]/ytd-watch-metadata[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ytd-menu-renderer[1]/div[1]/segmented-like-dislike-button-view-model[1]/yt-smartimation[1]/div[1]/div[1]/like-button-view-model[1]/toggle-button-view-model[1]/button[1]/yt-touch-feedback-shape[1]/div[1]/div[2]")).click(); 
	Thread.sleep(5000);
	driver.quit();
		
	}

}
