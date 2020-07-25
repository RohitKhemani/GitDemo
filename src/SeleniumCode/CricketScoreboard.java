package SeleniumCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CricketScoreboard {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\exe files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.id("rankingDropDown"))).build().perform();
		
		Thread.sleep(1200);
		
		driver.findElement(By.xpath("//a[@title='ICC Rankings Men']")).click();
		
		List<WebElement> list = driver.findElements((By.xpath("//div[@class='cb-col cb-col-100 cb-font-14 cb-lst-itm text-center']//div")));
		
		for(int i =1; i<list.size(); i++) {
			
	String Number =	list.get(i).getText();
		}
		
		
		
		
		
				
	}			

	}


