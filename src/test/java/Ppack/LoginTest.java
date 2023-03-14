package Ppack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.LoginPage;
import objectRepository.MyAccountPage;

public class LoginTest {

	//Need to make it as global this webdriver, otherwise we can not access this driver into another methods
	WebDriver driver;
	// this is(LogInTest) Test Script for Loginpage it is easy to readble to anyone, whatever we created objects in Loginpage,
	//we can get here by creating Object with class name (LoginPage)

	@Test
	public void LoginTestScript()
	{

		WebDriverManager.chromedriver().setup();

		// we need to pass this driver to each page otherwise we get Nullpointerexception
		driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/login");


		LoginPage login = new LoginPage(driver);

		login.eMail().sendKeys("saikumarkotagiri1996@gmail.com");
		login.Epassword().sendKeys("rgNC@vm8aD8p8j");
		login.login().click();


		MyAccountPage myac = new MyAccountPage(driver);
		Assert.assertTrue(myac.account().isDisplayed());
	}
	@AfterMethod
	public void Closure() {

		driver.quit();
	}
}
