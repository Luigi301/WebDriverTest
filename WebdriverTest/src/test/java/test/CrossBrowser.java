package test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.openqa.selenium.WebDriver;

import POs.BasePagePO.Browser;
import POs.DriverFactory;

class CrossBrowser {

	private WebDriver driver;
	private String baseUrl;
	

	@ParameterizedTest
	@EnumSource(Browser.class)
	void testA(Browser browser) {
		driver = DriverFactory.getNewDriverInstance(browser);
		baseUrl = "https://bonigarcia.dev/selenium-webdriver-java";
		driver.get(baseUrl);
	}

}
