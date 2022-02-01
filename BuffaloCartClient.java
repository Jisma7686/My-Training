package programs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BuffaloCartClient {
WebDriver driver;
@Test
void setbrowser() throws InterruptedException{
	
	driver.findElement(By.xpath("//a[text()='Clients']")).click();
	
    List<WebElement> company_names = driver.findElements(By.xpath("//table[@id='client-table']/tbody/tr/td[2]"));
	for (int i=0;i<company_names.size();i++) {
	System.out.println(company_names.get(i).getAttribute("innerText")); 
    }
	
    String sr=driver.findElement(By.xpath("//th[contains(text(),'Company name')]")).getText();
	System.out.println("**"+sr+"**");
	String ExpectedResult="Company name"; 
	Assert.assertEquals(sr, ExpectedResult,"Incorrect text"); 

}

@BeforeMethod
void openbrowser() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Documents\\chromedriver.exe");
     driver = new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	 driver.manage().window().maximize();
     driver.get("http://buffalocart.com/demo/crm/");
     driver.findElement(By.xpath("//input[@name='email']")).sendKeys("admin@admin.com");
 	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("123456");
 	 driver.findElement(By.xpath("//button[@type='submit']")).click();
     driver.findElement(By.xpath("//span[text()='Clients']")).click();
     
     String title=driver.getTitle();
     System.out.println("Title:"+title);
     String actualresult="Clients | Demo- Project Manager";
     Assert.assertEquals(actualresult, title,"Incorrect title");
}
@AfterMethod
void closebrowser() {
	driver.quit();
}

}


