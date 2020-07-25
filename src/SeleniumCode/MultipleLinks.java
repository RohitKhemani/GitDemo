package SeleniumCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleLinks {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\exe files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		//driver.manage().window().maximize();
		
	
		
		Thread.sleep(1000);
		
		
List<WebElement> list = driver.findElements(By.xpath("(//div[@class='navFooterLinkCol navAccessibility']//child::ul)[2]//li//a"));

System.out.println("The total links present in MakeMoney Section are: " +list.size());


Thread.sleep(2000);


for(int i =1; i<list.size(); i++) {
	
String key = 	Keys.chord(Keys.CONTROL,Keys.ENTER);

list.get(i).sendKeys(key);


}
	}
	
}


		
		
		
		
		

	


	
