package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class IxigoPageObjects {
	
	@FindBy(how=How.XPATH,using = "//div[contains(@class,'orgn')]//input")
	public WebElement fromTextbox;
	
	@FindBy(how=How.XPATH,using = "//div[contains(@class,'dstn')]//input")
	public WebElement toTextbox;

	@FindBy(how=How.XPATH,using = "//div[contains(@class,'orgn')]//div[@class='autocompleter-scroll-cntr']/div[1]")
	public WebElement fromSelectCity;
	
	@FindBy(how=How.XPATH,using = "//div[contains(@class,'dstn')]//div[@class='autocompleter-scroll-cntr']/div[1]")
	public WebElement toSelectCity; 
	
	@FindBy(how=How.XPATH,using = "//div[contains(@class,'from-date')]")
	public WebElement departureTextbox; 
	
	@FindBy(how=How.XPATH,using = "//div[contains(@class,'to-date')]")
	public WebElement returnTextBox; 
	
	@FindBy(how=How.XPATH,using = "//div[@class='rd-date']/div[1]//tbody")
	public WebElement departureDate; 
	
	@FindBy(how=How.XPATH,using = "//div[@class='rd-date']/div[2]//tbody")
	public WebElement returnDate; 
	
	@FindBy(how=How.XPATH,using = "//div[contains(@class,'passanger-class-input')]")
	public WebElement passengerTextBox; 
	
	@FindBy(how=How.XPATH,using = "//div[contains(@class,'passanger-class-list')]/div[2]")
	public WebElement travellers; 
	
	@FindBy(how=How.XPATH,using = "//div[contains(@class,'search")
	public WebElement searchButton; 
	
}
