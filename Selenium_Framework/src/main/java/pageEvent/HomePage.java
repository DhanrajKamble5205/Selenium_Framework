package pageEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BaseTC;

public class HomePage extends BaseTC{
	
	@FindBy(xpath = "//a[@href='/flights/']/span[2]")
	WebElement flight;

	@FindBy(xpath ="//li[contains(text(),'Round Trip')]")
	WebElement RoundTrip;
	
	@FindBy(xpath ="//li[contains(text(),'Multi City')]")
	WebElement MultiCity;
	
	
}
