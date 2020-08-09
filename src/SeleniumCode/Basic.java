package SeleniumCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Basic {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\exe files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

driver.get("https://www.spicejet.com");

//driver.findElement(By.id("divpaxinfo")).click();

//WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
//dropdown.click();

//Select select = new Select(dropdown);

//select.selectByValue("4");

WebElement date = driver.findElement(By.id("ctl00_mainContent_txt_Fromdate"));




		
		DateSelection(driver, date, "04-08-2020");
		
	}

	
	public static void DateSelection(WebDriver driver, WebElement element, String dateval) {
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateval+"');", element);
	}
}
