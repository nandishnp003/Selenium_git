package basic_hybrid_framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_orangehrm 
{
@FindBy(name = "username")
private WebElement un_txt;
@FindBy(name = "password")
private WebElement pass_txt;
@FindBy(xpath = "//button")
private WebElement login_btn;

 public pom_orangehrm(WebDriver driver)
 {
	 PageFactory.initElements(driver,this);
 }
 public WebElement getUN()
 {
	 return un_txt;
 }
 public WebElement getPass()
 {
	 return pass_txt;
 }
 public WebElement getLogin()
 {
	 return login_btn;
 }
}
