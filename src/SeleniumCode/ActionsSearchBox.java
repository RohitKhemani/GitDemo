package SeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSearchBox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\exe files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.com");
		
		Thread.sleep(3000);

		
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		
		Thread.sleep(3000);
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("RedmiNotePro").doubleClick().build().perform();
		
		
		
	}

}
