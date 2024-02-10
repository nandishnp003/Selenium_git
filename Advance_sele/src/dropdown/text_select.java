package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class text_select 
{

	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/nandish/Desktop/advvvv/single_dd.html");
	WebElement dd = driver.findElement(By.id("hotel"));
    Select sel=new Select(dd);
    List<WebElement> opts = sel.getOptions();
    sel.selectByIndex(0);
    sel.selectByValue("b");
    sel.selectByVisibleText("idli");
    List<WebElement> all_ll = sel.getAllSelectedOptions();
    int count = all_ll.size();
    System.out.println("the selected option is"+ count);
    for(WebElement ki:all_ll)
    {
    	String txt=ki.getText();
    	System.out.println(txt);
    }
    
}

}
