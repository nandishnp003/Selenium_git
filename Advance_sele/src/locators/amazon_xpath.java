package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class amazon_xpath
{
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.edge.driver", "./Softwares/msedgedriver.exe");
			WebDriver  driver= new EdgeDriver();
			driver.get("https://www.amazon.in");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("lenovo ideapad 5i");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//img[@alt='Sponsored Ad - Lenovo IdeaPad Slim 5 Intel Core i5 12450H 16\" (40.6cm) WUXGA+ IPS Laptop (16GB/512GB SSD/Win 11/Office 202...']")).click();
			Thread.sleep(5000);
			driver.quit();
			
		}

	}
