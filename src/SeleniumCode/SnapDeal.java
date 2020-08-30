package SeleniumCode;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\exe files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.snapdeal.com");
		
		
		
		WebElement list = driver.findElement(By.name("keyword"));
		list.sendKeys("NOKIA");
        list.sendKeys(Keys.ARROW_DOWN);
		list.sendKeys(Keys.ARROW_DOWN);
		list.sendKeys(Keys.ARROW_DOWN);
		list.sendKeys(Keys.ARROW_DOWN);
		list.sendKeys(Keys.ARROW_DOWN);

		list.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']")).click();
		

	List<WebElement> Selection = driver.findElements(By.xpath("//ul[@class='sort-value']//li"));	
		
	for(int i =1; i<Selection.size(); i++) {
		
		if (Selection.get(i).getText().equals("Price High To Low")){
			
			Selection.get(i).click();
		}
	}
	
	driver.findElement(By.xpath("//div[@class='accountInner']")).click();
	
	
	}
	
	

}
