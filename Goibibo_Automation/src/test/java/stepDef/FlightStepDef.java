package stepDef;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import driverStepup.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlightStepDef {
	
	private WebDriver driver;
	//private LoginPage loginPage;
	//private HomePage homePage;
 
	@Given("User open the application")
	public void open_the_application() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		}
	
//	@Given("And : User click on flights options")
//	public void login(List<Map<String, String>> credentials) {
//		loginPage = new LoginPage(this.driver);
//		loginPage.verifyLoginPage();
//		
//		String username = credentials.get(1).get("Username");
//		loginPage.sendUsername(username);
//		
//		String password = credentials.get(1).get("Password");
//		loginPage.sendUsername(password);
//	}
	
	@Given("User click on PopUp1 option")
	public void clickOnPopUp1() {
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
	}
	
	@Given("User click on PopUp2 option")
	public void clickOnPopUp2() {
		driver.findElement(By.xpath("//p[@class='sc-jlwm9r-1 ewETUe']")).click();
	}
	
	@Given("User select Round Trip button")
	public void ClickRoundTrip() {
		driver.findElement(By.xpath("//li[text()='Round Trip']")).click();
	}
	
	@When("User enter \"Pune\" and select the departure city")
	public void departureCity(String searchData) {
		driver.findElement(By.xpath("//span[text()='From']")).click();
	driver.findElement(By.xpath("//input[@aria-autocomplete='list']")).sendKeys(searchData);
		
		driver.findElement(By.xpath("//span[text()='Pune, India']")).click();
	}
	
	@When("User enter \"Nagpur\" and select the arrival city")
	public void arrivalCity() {
		driver.findElement(By.xpath("//span[text()='To']")).click();
		driver.findElement(By.xpath("//span[text()='Nagpur, India']")).click();
	}
	
	@When("User select the travel date")
	public void selectTravelDate() {
		driver.findElement(By.xpath("//div[@aria-label='Sat Jan 31 2026']")).click();
	}
	@When("User select the return date")
	public void returnDate() {
		driver.findElement(By.xpath("//div[@aria-label='Sun Feb 01 2026']")).click();
	}
	@Then("User click on search button")
	public void clickOnSearchbtn() {
		driver.findElement(By.xpath("//a[text()='Search']")).click();
	}
	
}

