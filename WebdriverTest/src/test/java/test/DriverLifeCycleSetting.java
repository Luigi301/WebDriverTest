package test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverLifeCycleSetting {
	protected WebDriver driver;
	
	@BeforeAll
	public static void beforeAll() {
		WebDriverManager.chromedriver().setup();
	}
	
	@SuppressWarnings("deprecation")
	@BeforeEach
	public void beforeEach() {
		this.driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@AfterEach
	public void afterEach() {
		if (this.driver != null)
			this.driver.quit();
	}
}
