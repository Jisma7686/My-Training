package SeleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GetImageNo {

WebDriver driver;

@BeforeMethod
public void openbrowser(){
	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   driver= new ChromeDriver();
	   driver.get("https://www.obsqurazone.com/course/javascript");
}

@Test
public void testImages() {

List<WebElement> listImages=driver.findElements(By.tagName("img"));
System.out.println("No. of Images: "+listImages.size());

}

@AfterMethod
public void test(){
driver.close();
}

}

