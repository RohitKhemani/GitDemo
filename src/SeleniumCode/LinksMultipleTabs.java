package SeleniumCode;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksMultipleTabs {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\exe files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		
	List<WebElement> links = driver.findElements(By.tagName("a"));
	
	System.out.println("Count of Links is: " +links.size());
	
	WebElement Footer = driver.findElement(By.id("navFooter"));
	
	List <WebElement> footerlink =Footer.findElements(By.tagName("a"));
	
	System.out.println("The Footer Link is: " +footerlink.size());
	

	
	WebElement Column =Footer.findElement(By.xpath("//div[@class='navFooterLinkCol navAccessibility']"));


	List<WebElement> Columnlinks = Column.findElements(By.tagName("a"));
	
	System.out.println("The Columnlinks is: " +Columnlinks.size());
	
	for(int i=1;i<=Columnlinks.size(); i++) {
		
	String KEY=	Keys.chord(Keys.CONTROL,Keys.ENTER);
		
		Columnlinks.get(i).sendKeys(KEY);
		
		
		
	}

	
	
	
	
	}

}
