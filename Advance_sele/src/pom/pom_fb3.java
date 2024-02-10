package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_fb3
{
	@FindBy(id = "email")
	private WebElement un_text;
	public pom_fb3(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public WebElement getun()
	{
		return un_text;
	}
}


