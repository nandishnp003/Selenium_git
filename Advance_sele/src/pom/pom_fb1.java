package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_fb1 
{
@FindBy(id = "email")
private WebElement un_text;
public pom_fb1(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public void getUn()
{
	un_text.sendKeys("hi");
}
}
