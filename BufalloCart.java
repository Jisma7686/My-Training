package SeleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BufalloCart {
	WebDriver driver;
	@BeforeMethod
	void openingBrowser()
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://buffalocart.com/demo/crm/");
	}
	@Test
	void verifyLogin()
	{
	WebElement userName_textbox=driver.findElement(By.id("email"));
	Assert.assertTrue(userName_textbox.isDisplayed(),"Email text box is not present in the page");
	userName_textbox.sendKeys("admin@admin.com");
	WebElement password_textbox=driver.findElement(By.id("password"));
	Assert.assertTrue(password_textbox.isDisplayed(),"Password text box is not present in the page");
	password_textbox.sendKeys("123456");
	WebElement submit_button=driver.findElement(By.xpath("//button[@type='submit']"));
	Assert.assertTrue(submit_button.isDisplayed(),"Submit Button is not present in the page");
	submit_button.click();
	WebElement dashboard=driver.findElement(By.className("dashboard-image"));
	Assert.assertTrue(dashboard.isDisplayed(),"Dashboard is not present, login failed");
	WebElement userName_dropdown=driver.findElement(By.id("user-dropdown"));
	Assert.assertTrue(userName_dropdown.isDisplayed(),"Username drop down not available");
	}
	@AfterMethod
	void closingBrowser()
	{
		driver.close();
	}
}

