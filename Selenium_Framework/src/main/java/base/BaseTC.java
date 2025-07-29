package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseTC {

	public static Properties config;
	public static WebDriver driver;
	
	public void driverintiliztion() {
		driver = new ChromeDriver();
		driver.get(config.getProperty("Url"));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Integer.parseInt(config.getProperty("pageloadTime"))));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	public void readPropertyFile() throws IOException {
		try {
			FileInputStream fileinput = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\resources\\Property\\config.properties");
			config = new Properties();
			config.load(fileinput);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
