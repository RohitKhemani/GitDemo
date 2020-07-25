package SeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AuthenticationPopup {
	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\exe files\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com");
		driver.findElement(By.linkText("Digest Authentication")).click();
		
	String title =	driver.getTitle();
	System.out.println("The Title of the Page is: " +title);

	
	}
}
