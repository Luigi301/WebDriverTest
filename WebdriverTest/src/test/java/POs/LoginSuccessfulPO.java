package POs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginSuccessfulPO extends BasePagePO {

	
	private By successBox = By.id("success");
	
	public LoginSuccessfulPO(WebDriver driver) {
		super(driver);
	}
	
	public boolean successBoxIsPresent() {
		return isIn(successBox);
	}
}