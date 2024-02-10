package basic_hybrid_framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class base_class_orangehrm implements interface_frame_work_constant_orangehrm
{
public WebDriver driver;
public WebDriverWait wait;
@BeforeMethod
public void openapp()
{
	System.setProperty(chrome_key,chrome_value);
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--start-maximized");
	driver=new ChromeDriver(opt);
	wait=new WebDriverWait(driver,10);
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
@AfterMethod
public void closeapp()
{
	driver.close();
}
}
