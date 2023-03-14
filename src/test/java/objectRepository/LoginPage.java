package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LoginPage{

	WebDriver driver;

	public LoginPage(WebDriver driver){

		this.driver=driver;

	}

	// it is like abstracted(It is like engine internal implementation as private, need to get these object by creating methods as public )
	// Login functionality : These are LogIn Web Page, web Objects of Login field Objects(elements)
	private By eMailField = By.id("input-email");
	private	By EPassword = By.id("input-password");
	private By LogField = By.xpath("//input[@class='btn btn-primary']");


	//Which you created for above Object(User name Element) as private, need to get those by creating methods as Public(Suppose: It is like Car Steering)
	public WebElement eMail() {

		return	driver.findElement(eMailField);
	}
	//Which you created for above Object(Password Filed Element) as private, need to get those by creating methods as Public(Suppose: It is like Car Gear Box)
	public WebElement Epassword () {

		return	driver.findElement(EPassword);

	}

	public WebElement login() {

		return driver.findElement(LogField);
	}

	


}
