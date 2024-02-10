package listeners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import screenshots.getphoto;

public class base_class 
{
	public WebDriver driver;
@BeforeMethod
public void openapp()
{
	System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
@AfterMethod
public void closeapp(ITestResult result)
{
	if(result.getStatus()==ITestResult.FAILURE);
	{
		getphoto.captureScreenshot(driver);
	}
	driver.close();
}
}
