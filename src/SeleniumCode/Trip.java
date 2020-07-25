package SeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Trip {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\exe files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("Mumbai");
		
		driver.findElement(By.xpath("//input[@name='ctl00$mainContent$chk_friendsandfamily']")).click();

		
		driver.findElement(By.name("ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("GOA");
		
		
	WebElement element =	driver.findElement(By.linkText("ADD-ONS"));
	
	
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		

		
		
	}
	
}