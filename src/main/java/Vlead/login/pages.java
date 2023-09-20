package Vlead.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pages {

	
	
		WebDriver driver;

		public pages(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		
	}
		
		@FindBy(name = "userName")
		WebElement un;

		public void user_name(String fnm) {
			un.sendKeys(fnm);
		}

		@FindBy(name = "password")
		WebElement pwd;

		public void password(String fnm) {
			pwd.sendKeys(fnm);
		}

		@FindBy(xpath = "//button[contains(@class,'btn btn-danger btn-block')]")
		WebElement login;

		public void loginbutton() {
			login.click();
		}

}
