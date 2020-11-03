package mainTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.IxigoPageObjects;
import utilities.Browser;
import utilities.PropertiesData;


public class IxigoMainTest {
	
	private WebDriver driver;
	private PropertiesData prop;
	private Browser browser;
	private String browsername, url;
	private WebDriverWait wait;
	private IxigoPageObjects ixigoPO;
	
	@BeforeClass
	public void setup()
	{
		browser=new Browser();
		prop=new PropertiesData();
		ixigoPO=new IxigoPageObjects();
		browsername=prop.getBrowser();
		url=prop.getURL();
		driver=browser.setup(browsername);
		wait=new WebDriverWait(driver, 60);
		ixigoPO=PageFactory.initElements(driver, IxigoPageObjects.class);
		driver.get(url);
		wait.until(ExpectedConditions.visibilityOf(ixigoPO.fromTextbox));
	}
	
	@Test
	public void search() throws InterruptedException
	{
		ixigoPO.fromTextbox.clear();
		ixigoPO.fromTextbox.click();
		ixigoPO.fromTextbox.sendKeys(prop.getFromCity());
		waitFor(2);
		ixigoPO.fromSelectCity.click();
		ixigoPO.toTextbox.clear();
		ixigoPO.toTextbox.click();
		ixigoPO.toTextbox.sendKeys(prop.getToCity());
		waitFor(2);
		ixigoPO.toSelectCity.click();
		waitFor(1);
		ixigoPO.departureTextbox.click();
		selectDepartureDate(prop.getDepartureDate());
		ixigoPO.returnTextBox.click();
		waitFor(2);
		selectReturnDate(prop.getReturnDate());
		ixigoPO.travellers.click();
		waitFor(1);
		selectPassenger(prop.getPassenger());
		
	}

	public void selectDepartureDate(String dprDate) throws InterruptedException
	{
		String dDate="'"+dprDate+"'";
		WebElement main=driver.findElement(By.xpath("//div[contains(@class,'rd-container')]//div[@class='rd-date']/div[1]//tbody//tr/td[contains(@data-date,"+(dDate)+")]"));
		main.click();
	}
	
	public void selectReturnDate(String returnDate)
	{
		String rtnDate="'"+returnDate+"'";
		WebElement element=ixigoPO.returnDate.findElement(By.xpath(".//tr/td[contains(@data-date,"+(rtnDate)+"]"));
		element.click();
	}
	
	public void selectPassenger(String passenger)
	{
		
		WebElement element=ixigoPO.travellers.findElement(By.xpath("./div[1]/div[2]/span["+(passenger)+"]"));
		element.click();
	}
	
	public void waitFor(long seconds) throws InterruptedException {
			Thread.sleep(seconds * 1000);
	}
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
}
