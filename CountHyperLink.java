package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CountHyperLink {

WebDriver driver;

@Test
public void testIinks() {
List<WebElement> links=driver.findElements(By.tagName("a"));
System.out.println("Total Number Of HyperLinks: "+links.size());
List<WebElement> images=driver.findElements(By.tagName("img"));
System.out.println("Total Number Of Images: "+images.size());

}

@BeforeMethod
public void openbrowser(){
	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   driver= new ChromeDriver();
	   driver.get("https://www.obsqurazone.com");
}

@AfterMethod
public void test(){
driver.close();
}

}

