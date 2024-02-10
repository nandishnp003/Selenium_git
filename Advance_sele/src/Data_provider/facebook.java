package Data_provider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class facebook 
{
@Test(dataProvider="facebook")
public void run(String un,String pwd)
{
	System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.id("email")).sendKeys(un);
	driver.findElement(By.id("pass")).sendKeys(pwd);
	driver.findElement(By.name("login")).click();
}
@DataProvider(name="facebook")
public Object[][] testdata()
{
	return new Object[][]
  {
		{"nandish","123"},
		{"manual","456"},
		{"java","789"}
  };

}
}
