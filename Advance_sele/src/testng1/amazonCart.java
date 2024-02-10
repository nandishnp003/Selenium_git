package testng1;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class amazonCart {
		@Test
		public void addtoCart()
		{
			System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in");
			driver.navigate().refresh();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@ id='twotabsearchtextbox']")).sendKeys("hp laptop", Keys.ENTER);
			WebElement ele = driver.findElement(By.xpath("//span[contains (text(),'Ultral Light Laptop for Students and Business, Intel Quad-Core N4120, 8GB RAM, 192GB Storage(64GB eMMC+128GB Micro SD), 1 Year Office 365, Webcam, HDMI, WiFi, USB-A&C, Win 11 S')]"));
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("arguments[0].scrollIntoView();",ele);
			ele.click();
			Set<String> wh = driver.getWindowHandles();
			ArrayList<String> arrayList= new ArrayList<String>(wh);
			String win = arrayList.get(1);
			driver.switchTo().window(win);
			driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
			String Pw = arrayList.get(0);
			driver.switchTo().window(Pw);
			driver.close();
			driver.quit();
		}

	}


