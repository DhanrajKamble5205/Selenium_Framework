package pageEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseTC;

public class HomePage extends BaseTC{
	
	@FindBy(xpath = "//a[@href='/flights/']/span[2]")
	WebElement flightMenu;
	
//	@FindBy(xpath = "//input[@placeholder='From']")
//	WebElement flightMenu;

	@FindBy(xpath ="//li[contains(text(),'Round Trip')]")
	WebElement RoundTripMenu;
	
	@FindBy(xpath ="//li[contains(text(),'Multi City')]")
	WebElement MultiCity;
	
	@FindBy(xpath = "//span[normalize-space()='From']")
	WebElement searchFromCity;
	
	@FindBy(xpath = "//label[@for='toCity']")
	WebElement searchToCity;
	
	@FindBy(xpath = "//div[contains(@class,'dateFiled']")
	WebElement DepartureDropDown;
	
	@FindBy(xpath = "//span[normalize-space()='Return']")
	WebElement ReturnDate;
	
	@FindBy(xpath = "//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")
	WebElement SearchButton;
	
	String DepartureDate = "//div[@aria-label='%replace' and aria-disabled='false']";
	String RetureDate = "//div[@aria-label='%replace' and aria-disabled='false']";
	
	public HomePage() {
		super();
		PageFactory.initElements(driver,this);
	}
	
	public void selectFlightMenu() {
		flightMenu.click();
	}
	
	public void selectRoundTripMenu() {
		RoundTripMenu.click();
	}
	
	public void selectFromCityDropDown() {
		searchFromCity.click();
		searchFromCity.sendKeys(config.getProperty("From"));
		searchFromCity.sendKeys(Keys.TAB);
	}
	
	public void selectReturnCity() {
		searchFromCity.sendKeys(config.getProperty("To"));
		searchFromCity.sendKeys(Keys.TAB);
	}
	
	public void enterDepartureDate() {
		DepartureDropDown.click();
	}
	
	
	
	
	
}
