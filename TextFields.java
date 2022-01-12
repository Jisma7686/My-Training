package SeleniumPrograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.List;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TextFields {
	WebDriver driver;
  @Test
  public void checkelements() throws Exception {
	 WebElement element= driver.findElement(By.id("userName"));
	 Assert.assertTrue(element.isDisplayed(), "not findusername");
	 element.sendKeys("acvbtw");
	 
	 WebElement element1= driver.findElement(By.id("userEmail"));
	 Assert.assertTrue(element1.isDisplayed(), "not find useremail");
	 element1.sendKeys("joe34123@gmail.com");
	
	 WebElement element2= driver.findElement(By.id("currentAddress"));
	 Assert.assertTrue(element2.isDisplayed(), "not find useremail");
	 element2.sendKeys("Dubai,BurDubai");
	
	 WebElement element3= driver.findElement(By.id("permanentAddress"));
	 Assert.assertTrue(element3.isDisplayed(), "not find useremail");
	 element3.sendKeys("Thrissur");
	
	 WebElement element4= driver.findElement(By.id("submit")); 
	 Assert.assertTrue(element3.isDisplayed(), "not find useremail");
	 Thread.sleep(3000);
     element4.click();
     
     WebElement display = driver.findElement(By.xpath(" //div[@class='border col-md-12 col-sm-12'] "));
     Assert.assertEquals(display.isDisplayed(), "textbox details not available");
  
  }

@AfterMethod
public void afterMethod() {
	  driver.close();
}
}
