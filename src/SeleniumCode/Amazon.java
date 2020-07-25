package SeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\exe files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@class='a-button-input'])[1]")).click();
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//img[@alt='Fisher-Price Soothing Motions Bassinet, Windmill']"))).build().perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[@class='a-link-normal feed-carousel-control feed-right'])[1]")).click();
		
		
	}
}