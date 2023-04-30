package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage{	
	WebDriver driver;	
	//============================ Objects ======================================	
	@FindBy(linkText="Log in")
	WebElement loginLink;
	
	@FindBy(name="user_login")
	WebElement userName;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(className="rememberMe")
	WebElement RememberMe;
	
	@FindBy(name="btn_login")
	WebElement loginBtn;	
	//============================ Methods ==============================================
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void LoginFunction(String UserNameVal,String PwdVal) {
	
		loginLink.click();
		userName.sendKeys(UserNameVal);
		password.sendKeys(PwdVal);
		RememberMe.click();
		loginBtn.click();
		
	}


}


/*public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {

		this.driver = driver;
	}

	public void LoginFunction(String UserNameVal, String PwdVal) {

		// step-3: click on the Login link on top right corner
		WebElement loginLink = driver.findElement(By.linkText("Log in"));
		loginLink.click();

		// step-4: Enter the user name

		WebElement userName = driver.findElement(By.name("user_login"));
		userName.sendKeys(UserNameVal);

		// step-5: Enter the password

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(PwdVal);

		// step-6 : Click on Remember me check box

		WebElement RememberMe = driver.findElement(By.className("rememberMe"));
		RememberMe.click();

		// step-7 : Click on the Login button

		WebElement loginBtn = driver.findElement(By.name("btn_login"));
		loginBtn.click();

	}

}*/
