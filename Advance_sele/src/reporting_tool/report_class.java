package reporting_tool;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITest;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentSparkReporterConfig;

public class report_class
{
	@Test
	public void run()
	{
		ExtentSparkReporter reporter=new ExtentSparkReporter("./reporting_folder/report.html");
		ExtentReports reports = new ExtentReports();
		reports.attachReporter(reporter);
		ExtentTest test =reports.createTest("check for title").assignAuthor("nandish np");
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		test.log(Status.INFO,"empty firefox is launch");
		driver.get("https://www.zomato.com/india");
		test.log(Status.INFO,"zomato applctn launch");
		String title=driver.getTitle();
		if (title.equals("abc"));
		{
			test.log(Status.PASS,"title is correct");
		}
		else
		{
			test.log(Status.FAIL,"title is correct");
			test.addScreenCaptureFromPath(getphoto(driver));
		}
		reports.flush();
		driver.close();
	}
	public String getphoto(WebDriver driver) throws IOException
	{
		String path="./Photos/defect.jpg";
		TakesScreenshot tss=(TakesScreenshot)driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File dst = new File(path);
		org.openqa.selenium.io.FileHandler.copy(src, dst);
		return path;

		
	}

}
