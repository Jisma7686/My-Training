package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTester {

	WebDriver driver;
	@BeforeMethod
	void openingBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Documents\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.manage().window().maximize();
		driver.get("https://erp.buffalocart.com/");
	}
	
	@AfterMethod
	void closingBrowser()
	{
		driver.quit();
	}

}

