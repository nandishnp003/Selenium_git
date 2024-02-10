package mouse_actions;

import org.openqa.selenium.WebDriver;

public class assignment {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","Softwares/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("")
	}

}
