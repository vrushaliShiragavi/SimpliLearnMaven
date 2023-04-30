package testcases;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;
import pages.LoginPage;

public class LoginTest extends BaseClass {

	@Test
	public void test1() {
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("abc@xyz.com", "Abc@1234");

		WebElement error = driver.findElement(By.id("msg_box"));

		String ActError = error.getText();
		String ExpError = "The email or password you have entered is invalid.";

		Assert.assertEquals(ActError, ExpError);

	}

	@Test
	public void test2() {

		LoginPage login = new LoginPage(driver);
		login.LoginFunction("pqr@xyz.com", "Abc@1234");

	}

	@Test
	public void test4(Method method) throws FilloException {

		Recordset recordset = connection.executeQuery("select * from data where TestName='" + method.getName() + "'");
		recordset.next();

		String UserName = recordset.getField("UserName");
		String Password = recordset.getField("Password");

		LoginPage login = new LoginPage(driver);
		login.LoginFunction(UserName, Password);

	}

}
