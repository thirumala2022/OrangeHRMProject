package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ObjectRepository {
WebDriver _driver;
	
	public By eltEmail=By.xpath("//input[@id='txtUsername']");
	public By eltPwd=By.xpath("//input[@id='txtPassword']");
	public By eltLogin=By.xpath("//input[@id='btnLogin']");
	public By eltLogo=By.xpath("//img[@alt='OrangeHRM']");
	
	public void ClickElement(By elt) {
		
		WaitElementExists(elt).click();
		
	}
	public boolean IsDisplayed(By elt) {		
		
		return WaitElementExists(elt).isDisplayed();
	}
	public void Sendtext(By elt,String text) {
		
		WaitElementExists(elt).clear();
		WaitElementExists(elt).sendKeys(text);
		
	}
	
	
	public WebElement WaitElementExists(By elt) {
		
		WebDriverWait wait = new WebDriverWait(_driver,30);
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(elt));
		 return element;
	}
	
	public ObjectRepository(WebDriver driver) {
		this._driver=driver;
	}


}
