package testng1;


import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class base_play_youtube extends base_class_youtube
{
@Test
public void paly_script() throws InterruptedException
{
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("sudeep song");
	driver.findElement(By.xpath("//button[@id=\'search-icon-legacy\']")).click();
	driver.findElement(By.xpath("(//a[@id='video-title'])[1]")).click();
	Thread.sleep(5000);
}

}
