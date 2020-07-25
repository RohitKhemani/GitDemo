package SeleniumCode;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TESTNG {
	
	 public static WebDriver driver;
	
	
	
	@BeforeMethod
	
	public void initialization() {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\exe files\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://mail.aqmtechnologies.com/action/login/aqmtechnologies.com"); 	
		
	}
		
	
	
	@DataProvider
	
	public Object[][] fetchdata() throws EncryptedDocumentException, IOException {
		
	Object data[][] =	DataDriven.selection("RK");
	return data;
		
		
	}
	
@Test(dataProvider = "fetchdata")

public void login(String EMAIL, String Password) {
	
	WebElement user = driver.findElement(By.name("custom_input"));
	
	WebElement pw = driver.findElement(By.name("passwd"));
	
	user.sendKeys(EMAIL);
	pw.sendKeys(Password);
}


@AfterMethod

public void teardown() {
	
	driver.quit();
}
	
	
}