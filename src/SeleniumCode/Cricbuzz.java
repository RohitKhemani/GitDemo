package SeleniumCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Cricbuzz {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\exe files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com");
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[@id='seriesDropDown']"))).build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@title='South Africa tour of India, 2020']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@title='Schedule and Results']")).click();
		Thread.sleep(2000);
		
	List<WebElement> Date = 	driver.findElements(By.xpath("//span[@class='ng-binding']"));
	
	
		
		for(int i=0; i<Date.size(); i++) {
			
			if(Date.get(i).getText().equals("Mar 12, Thu")) {
				
				System.out.println("Date of the match is: " +Date.get(3));
			}

		
		}
		
		
	}

	

}
