package SeleniumCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\exe files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		//Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		links.addAll(driver.findElements(By.tagName("img")));
		
		System.out.println("The links are: " +links.size());
		
		Thread.sleep(2000);
		
		for(int i=1; i<links.size(); i++) {
			
			if(links.get(i).getAttribute("href")!=null) {
									

			}
		}
		
		System.out.println("The Active links are: " +links.size()); 

		
		
		
	}

}
