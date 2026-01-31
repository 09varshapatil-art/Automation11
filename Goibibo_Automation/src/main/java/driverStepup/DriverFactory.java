package driverStepup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.ConfigReader;
import config.EnviornmentConfig;

public class DriverFactory {
	
	 public static WebDriver driver;
	 public static EnviornmentConfig envConfig;

	public void setup() {
		envConfig = ConfigReader.getActiveEnviornment();
		
		if(envConfig.getBrowserName().equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		if(envConfig.getBrowserName().equals("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		if(envConfig.getBrowserName().equals("Edge"))
		{
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		
		System.out.println("Url : " + envConfig.getBaseUrl());
		driver.get(envConfig.getBaseUrl());
		
	}
	
	public void tearDown() {
		if(driver != null) {
			
			driver.quit();
		}
		
	}
}
