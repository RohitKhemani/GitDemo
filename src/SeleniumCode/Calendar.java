package SeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calendar {
	
static WebDriver driver;
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\exe files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		
		WebElement Travel = driver.findElement(By.xpath("//input[@name='travel_date']"));
		
		dateselection(driver, Travel, "21-05-2020");
	}
		
	//WebElement buffer =	driver.findElement(By.xpath"//select[@id='datebetween']"));
	
	//WebElement Language = driver.findElement(By.xpath("//select[@name='travel_language']"));
	
	//selection(buffer, "+ - 3 Weeks");
	
	//selection(Language, "Sindhi");
	
//	}

//	public static void selection(WebElement element, String value) {
		
		//Select select = new Select(element);
		//select.selectByVisibleText(value);


	//}

	
	
	
	public static void dateselection(WebDriver driver, WebElement element, String date) {
		
	JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value', '"+date+"');", element);
		
		
		
		
	
		
		
	}
	
	}



