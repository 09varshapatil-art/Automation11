package pom;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightBooking {
	@FindBy (xpath ="//span[@class='logSprite icClose']")
	private WebElement popUp1;
	
	@FindBy (xpath ="//p[@class='sc-jlwm9r-1 ewETUe']")
	private WebElement popUp2;
	
	@FindBy (xpath ="//li[text()='Round Trip']")
	private WebElement roundTrip;
	
	@FindBy (xpath = "//span[text()='From']")
	private WebElement from;
    
    @FindBy (xpath = "//input[@aria-autocomplete='list']")
	private WebElement searchCity;
    
    @FindBy (xpath = "//span[text()='Pune, India']")
	private WebElement pune;
    
    @FindBy (xpath = "//span[text()='To']")
	private WebElement to;
    
    @FindBy (xpath = "//input[@autocomplete='off']")
	private WebElement toSearch;
    
    @FindBy (xpath = "//span[text()='Nagpur, India']")
	private WebElement nagpur;
    
    @FindBy (xpath = "//div[@aria-label='Sat Jan 31 2026']")
	private WebElement fromDate;
    
    @FindBy (xpath = "//div[@aria-label='Sun Feb 01 2026']")
	private WebElement returnDate;
    
    @FindBy (xpath = "//a[text()='Search']")
	private WebElement search;
    
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions act;
 
    public FlightBooking(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    	this.driver=driver;
    	this.wait = new WebDriverWait(driver,Duration.ofSeconds(120));
    	act = new Actions(this.driver);
    }
	
    public void clickOnPopUp1() {
    	this.popUp1.click();
    }
    public void clickOnPopUp2() {
    	this.popUp2.click();
    }
    public void clickOnRoundTrip() {	
    	wait.until(ExpectedConditions.visibilityOf(roundTrip)).click();
        this.act.moveToElement(roundTrip).build().perform(); 
    }
    public void clickOnFrom() {
      	wait.until(ExpectedConditions.visibilityOf(from));
    	from.click();
    	this.act.moveToElement(from).build().perform(); 
    }
    public void EnterCityName(String searchData) throws InterruptedException {
    	try {
    		System.out.println("Enter City Name");
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    	wait.until(ExpectedConditions.visibilityOf(searchCity));
    	this.searchCity.sendKeys(searchData);
    	Thread.sleep(2000);
    	System.out.println("Enter City Name Pune");
    	}
    	catch(Exception e) 
    	{
    		e.printStackTrace();
    		System.out.println("Failed to Enter City Name");
    	}
    }
    public void clickOnPune() {
      	wait.until(ExpectedConditions.visibilityOf(pune)).click();
    	
    }
    public void clickOnTo() {
      	wait.until(ExpectedConditions.visibilityOf(to)).click();
       	this.act.moveToElement(to).build().perform(); 
    } 
    
    public void sendTexttoCity(String toData) {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    	wait.until(ExpectedConditions.visibilityOf(toSearch));
      	this.toSearch.sendKeys(toData);
    }
    public void clickOnNagpur() {
   	  	wait.until(ExpectedConditions.visibilityOf(nagpur)).click();
   		//this.act.moveToElement(nagpur).build().perform(); 
    }
    
    public void ClickOnFromDate() {
      	wait.until(ExpectedConditions.visibilityOf(fromDate)).click();
    	//this.act.moveToElement(fromDate).build().perform(); 
    }
    public void clickOnReturnDate() {
      	wait.until(ExpectedConditions.visibilityOf(returnDate)).click();
        //this.act.moveToElement(returnDate).build().perform(); 
    }
    public void clickOnSearchBtn() {
       	wait.until(ExpectedConditions.visibilityOf(search)).click();
      //  this.act.moveToElement(search).build().perform(); 
    }  
}
