package Test;

import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.NewUserPage;
import Pages.UserPage;

public class AddNewUserTest extends BaseTester{

	@Test
	void verifyUserCreation()
	{
		LoginPage bcLoginpage=new LoginPage(driver);
	    bcLoginpage.userLogin("admin", "123456");
		HomePage hp=new HomePage(driver);
		hp.clickOnMenuWithName("User");
		UserPage up=new UserPage(driver);
		up.clickOnNewUserLink();
		NewUserPage nup= new NewUserPage(driver);
		nup.enterFullName("Jisma");
		nup.enterEmploymentID("786");
		nup.enterUserName("jisma.g");
		nup.enterPassword("12345a");
		nup.enterConfirmPassword("12345a");
		nup.enterEmailaddress("ji.g786@gmail.com");
		nup.enterPhoneNumber("123456789");
		nup.enterMobileNumber("971561262035");
		nup.enterSkypeID("test123");
		nup.selectUserType("Admin");
		nup.ChoosePermissionRadioButton(1);
		nup.clickOnCreateUserButton();
	}
	
	}



