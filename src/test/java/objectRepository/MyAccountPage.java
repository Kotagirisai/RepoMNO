package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class MyAccountPage{

	WebDriver driver;

	public MyAccountPage(WebDriver driver) {
		this.driver=driver;

	}

	By Account = By.xpath("//a[text()='Account']");




	public WebElement account () {

		return driver.findElement(Account);
	}


}