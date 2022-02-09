package TestPackage;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LoginPage extends baseClass{
	@Test
	public void LoginValidation() {
		ob=new ObjectRepository(driver);
		ob.Sendtext(ob.eltEmail, "Admin");
		ob.Sendtext(ob.eltPwd, "admin123");
		ob.ClickElement(ob.eltLogin);
		System.out.println(ob.IsDisplayed(ob.eltLogo));
		Assert.assertEquals(ob.IsDisplayed(ob.eltLogo), true);
		
	}
	
	@AfterTest
	public void TestCleanUp() {
		driver.quit();
	}


}
