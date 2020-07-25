package SeleniumCode;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomListener.class)

public class ScreenshotTest extends Base {
	
	
	@BeforeMethod
	
	public void setup() {
		
		initialisation();
		
	}
		
		
		
	
	
	
	@Test
	
	public void Deal() {
		
	Assert.assertEquals(false, true);
	
	}
		
	
	
	
	
	@AfterMethod
	
	public void teardown() {
		driver.quit();
	}
	

}
