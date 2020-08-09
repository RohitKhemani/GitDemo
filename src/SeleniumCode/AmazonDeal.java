package SeleniumCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonDeal {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\exe files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		driver.findElement(By.xpath("(//input[@class='a-button-input'])[1]")).click();
		
		List<WebElement> list = driver.findElements(By.xpath("(//div[@class='navFooterLinkCol navAccessibility'])[1]//ul//li//a"));
		
		for(int i =1; i<list.size();i++) {
			
		String KEY=	Keys.chord(Keys.CONTROL,Keys.ENTER);

		list.get(i).sendKeys(KEY);
		}
		
	}
	
	
		
	}


