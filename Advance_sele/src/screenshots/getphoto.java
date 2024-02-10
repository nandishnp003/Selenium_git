package screenshots;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class getphoto 
{
	public static void captureScreenshot(WebDriver driver)
	{
		Date d=new Date(0);
		String dt = d.toString().replaceAll(":", "-");
		TakesScreenshot tss = (TakesScreenshot)driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File dst = new File("./Photos"+dt+".png");
		try 
		{
			FileHandler.copy(src, dst);
		} 
		catch (IOException e) 
		{
			System.out.println("page is not found");
		}
	}
}