package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePagee {
	
	@FindBy (xpath ="//span[@class='logSprite icClose']")
	private WebElement popUp1;
	
	@FindBy (xpath ="//p[contains(@class,'sc-jlwm9r-1 ewETUe')]")
	private WebElement popUp2;
	
	@FindBy (xpath ="//li[@data-cy='oneWayTrip']")
	private WebElement oneWayTrip;
	
	@FindBy (xpath ="//li[text()='Round Trip']")
	private WebElement roundTrip;
	
	@FindBy (xpath ="//li[@data-cy='mulitiCityTrip']")
	private WebElement mulitiCityTrip;
	
	@FindBy (xpath = "//span[text()='From']")
	private WebElement from;
    
    @FindBy (xpath = "//input[@aria-autocomplete='list']")
	private WebElement fromCity;
    
    @FindBy (xpath = "//li[@id='react-autowhatever-1-section-0-item-0']")
	private WebElement fromCitySelect;
    
    
    @FindBy (xpath = "//span[text()='To']")
	private WebElement to;
    
    @FindBy (xpath = "//input[@autocomplete='off']")
	private WebElement toCity;
    
    @FindBy (xpath = "//li[@id='react-autowhatever-1-section-0-item-0']")
   	private WebElement toCitySelect;
       
    
    @FindBy (xpath = "//span[text()='Departure']")
   	private WebElement departure; 
    
    @FindBy (xpath = "//span[@aria-label='Next Month']")
   	private WebElement nextMonth; 
    
    @FindBy (xpath = "//div[@role='listbox']")
    private WebElement listbox;
    
    @FindBy (xpath = "//div[@aria-label='Sat Jan 31 2026']")
	private WebElement fromDate;
    
    @FindBy (xpath = "//div[@aria-label='Sun Feb 1 2026']")
	private WebElement returnDate;
    
    @FindBy (xpath = "//a[text()='Search']")
	private WebElement searchBtn;
    
    
    
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions act;
  //Constructor  
    public HomePagee(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    	this.driver=driver;
    	this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	act = new Actions(this.driver);
    }
	//Methods
    public void clickOnPopUp1()
    {
    	wait.until(ExpectedConditions.elementToBeClickable(popUp1)).click();
    }
//    public void clickOnPopUp2()
//    {
//    	wait.until(ExpectedConditions.elementToBeClickable(popUp2)).click();   	
//    }
    public void verifyFlightType(String type)
    {
    	boolean status = false;
    	if(type.equalsIgnoreCase("oneWayTrip"))
    	{
    	status = oneWayTrip.isSelected();
    	}
    	
    	else if(type.equalsIgnoreCase("roundTrip"))
    	{
    		status = roundTrip.isSelected();
    	}
    	else if(type.equalsIgnoreCase("mulitiCityTrip"))
    	{
    		status = mulitiCityTrip.isSelected();
    	}
    	else
    	{
    		Assert.fail("Invalid Flight type" + type);
    	}
 
    Assert.assertEquals(status, false, "Fail to verify" + type + "radio button is selected");
 // OR

   // Assert.assertTrue(status, type + "flightType button not selected");
     }
  
    
    
   
    
    public void clickOneWayTrip()
    {	
    	wait.until(ExpectedConditions.visibilityOf(oneWayTrip));
    	this.act.moveToElement(oneWayTrip).build().perform();    
    	//this.oneWayTrip.click();
    }
    public void clickOnRoundTrip()
    {	
    	wait.until(ExpectedConditions.visibilityOf(roundTrip)).click();
    	this.act.moveToElement(roundTrip).build().perform();     	
    }
   
   
   public void enterFromCity(String city)
   {
	   wait.until(ExpectedConditions.elementToBeClickable(from));
	   this.from.click();
	   this.fromCity.sendKeys(city);	
	   wait.until(ExpectedConditions.visibilityOf(fromCitySelect));
	   this.fromCitySelect.click();
   }
   
   public void enterToCity(String city)
   {
	   wait.until(ExpectedConditions.elementToBeClickable(to));
	   this.to.click();
	   this.toCity.sendKeys(city);
	   wait.until(ExpectedConditions.visibilityOf(toCitySelect));
	   this.toCitySelect.click();
	   
   }
    
   public void oneWayDepartureDate(String departureDate)
   {
	   wait.until(ExpectedConditions.elementToBeClickable(departure)).click();
	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='DayPicker-Months']")));     //div[contains(@class,'DayPicker-Months')]
	   
	   driver.findElement(By.xpath("//p[text()='"+ departureDate +"']")).click();
   }
    
     public void clickOnReturnDate(String option)
    {
    	wait.until(ExpectedConditions.visibilityOf(returnDate));
    	returnDate.click();
    	//this.act.moveToElement(returnDate).build().perform(); 
    }
    public void clickOnSearchBtn()
    {
    	wait.until(ExpectedConditions.visibilityOf(searchBtn));
    	searchBtn.click();
    	//this.act.moveToElement(searchBtn).build().perform(); 
    }
    public void clickOnMultiCityTrip()
    {	
    	wait.until(ExpectedConditions.visibilityOf(mulitiCityTrip));
    	this.act.moveToElement(mulitiCityTrip).build().perform();     	
    }
    
}


