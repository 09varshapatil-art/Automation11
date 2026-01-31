package pom;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
// Variables
	@FindBy (xpath ="//span[@class='logSprite icClose']")
	private WebElement popUp1;
	
	@FindBy (xpath ="//p[contains(@class,'sc-jlwm9r-1 ewETUe')]")
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
  //Constructor  
    public HomePage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    	this.driver=driver;
    	this.wait = new WebDriverWait(driver,Duration.ofSeconds(120));
    	act = new Actions(this.driver);
    }
	//Methods
    public void clickOnPopUp1()
    {
    	this.popUp1.click();
    }

    public void clickOnRoundTrip()
    {	
  //  	SoftAssert soft = new SoftAssert();
    //	soft.Assert
    	//this.roundTrip.click();
    	//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
    	wait.until(ExpectedConditions.visibilityOf(roundTrip));
    	//roundTrip.click();
    	// Actions act = new Actions(this.driver);
    	//act.click().perform();
    	this.act.moveToElement(roundTrip).build().perform(); 
    	
    	
    	
    }
   
    public void clickOnFrom()
    {
    	//this.from.click();
    //	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    	wait.until(ExpectedConditions.visibilityOf(from));
    	from.click();
    	this.act.moveToElement(from).build().perform(); 
    }
   
    public void EnterCityName(String searchData)
    {
    	 wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    	this.searchCity.sendKeys(searchData);
    }
    
    public void clickOnTo()
    {
    	//this.to.click();
    	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    	wait.until(ExpectedConditions.visibilityOf(to));
    	//to.click();
    	this.act.moveToElement(to).build().perform(); 
    } 
    
    public void sendTexttoCity(String toData)
    {
    wait = new WebDriverWait(driver, Duration.ofSeconds(60));
      	this.toSearch.sendKeys(toData);
    }
    public void clickOnNagpur()
    {
      	//this.nagpur.click();
    	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    	wait.until(ExpectedConditions.visibilityOf(nagpur));
   		//nagpur.click();
    	this.act.moveToElement(nagpur).build().perform(); 
    }
    public void ClickOnFromDate(String option)
    {
      	//this.fromDate.click();
    	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    	wait.until(ExpectedConditions.visibilityOf(fromDate));
    	//fromDate.click();
    	this.act.moveToElement(fromDate).build().perform(); 
    }
    public void clickOnReturnDate(String option)
    {
      	//this.returnDate.click();
    	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    	wait.until(ExpectedConditions.visibilityOf(returnDate));
    	//returnDate.click();
    	this.act.moveToElement(returnDate).build().perform(); 
    }
    public void clickOnSearchBtn()
    {
      	//this.search.click();
      //	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    	wait.until(ExpectedConditions.visibilityOf(search));
    	//search.click();
    	this.act.moveToElement(search).build().perform(); 
    }
}
    
  