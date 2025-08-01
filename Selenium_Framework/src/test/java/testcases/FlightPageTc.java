package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTC;
import pageEvent.HomePage;
// https://www.youtube.com/watch?v=R9-NFapPRe0&t=5042s
public class FlightPageTc extends BaseTC{
	
	@Test
	public void searchFlight() {
		
		HomePage home = new HomePage();
		home.selectClosePopUp();
		home.selectClosePopUp2();
		home.selectRoundTripMenu();
		home.selectFlightMenu();
		home.selectFromCityDropDown();
		home.selectReturnCity();
		home.enterDepartureDate();
		home.enterReturnDate();
		home.searchButton();
		
	}

	
}
