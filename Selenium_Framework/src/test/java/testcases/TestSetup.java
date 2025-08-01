package testcases;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import base.BaseTC;

public class TestSetup extends BaseTC{

	@BeforeSuite()
	public void setUp() throws IOException {
		readPropertyFile();
		driverintiliztion();
	}
	
	@AfterSuite()
	public void tearDown() {
		//driver.quit();
	}
	
}
