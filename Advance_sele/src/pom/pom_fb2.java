package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_fb2
{
		@FindBy(id = "email")
		private WebElement un_text;
		public pom_fb2(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		public void getun(String un)
		{
			un_text.sendKeys(un);
		}
}

