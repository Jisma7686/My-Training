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

public class WebElementTest {
	WebDriver driver;
  @Test(enabled=true)
  public void checkelements() throws Exception {
	 WebElement element= driver.findElement(By.id("userName"));
	 Assert.assertTrue(element.isDisplayed(), "not findusername");
	 element.sendKeys("opr");
	 
	 WebElement element1= driver.findElement(By.id("userEmail"));
	 Assert.assertTrue(element1.isDisplayed(), "not find useremail");
	 element1.sendKeys("dty123@gmail.com");
	
	 WebElement element2= driver.findElement(By.id("currentAddress"));
	 Assert.assertTrue(element2.isDisplayed(), "not find useremail");
	 element2.sendKeys("Mumbai");
	
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
  @Test(enabled=true)
  public void checktablerows() {
	 driver.navigate().to("https://demoqa.com/webtables");
	 List<WebElement> elements=driver.findElements(By.className("rt-tr-group"));
		Iterator<WebElement> itr = elements.iterator();
		int counter=0;
		while(itr.hasNext())
		{
			String data=itr.next().getText();
			if(!data.isBlank())
			{
				counter=counter+1;
			}
			else
			{
		       System.out.println("No Of Rows With Data : "+ counter);
		       break;
			}     
		}
	
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.get("https://demoqa.com/text-box");;
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
