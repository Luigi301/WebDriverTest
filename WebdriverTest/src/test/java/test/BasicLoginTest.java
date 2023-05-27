package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import POs.LoginFormPO;
import POs.LoginSuccessfulPO;
import POs.BasePagePO.Browser;

public class BasicLoginTest extends DriverLifeCycleSetting {
	
	private LoginFormPO login;
	private LoginSuccessfulPO loginSuccess;
	
	@ParameterizedTest
	@EnumSource(Browser.class)
	public void testLoginOK() {
		this.login = new LoginFormPO(this.driver);
		loginSuccess = (LoginSuccessfulPO) login.with("user", "user"); 
		assertTrue(loginSuccess.successBoxIsPresent());
	}
	
	@ParameterizedTest
	@EnumSource(Browser.class)
	public void testLoginNotOK() {
		login = new LoginFormPO(this.driver);
		login.with("user", "error");
		assertTrue(login.invalidBoxIsPresent());
	}
}
