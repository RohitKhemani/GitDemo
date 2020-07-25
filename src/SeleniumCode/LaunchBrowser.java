package SeleniumCode;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Properties;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
	
	static WebDriver driver;
	


	public static void main(String[] args) throws IOException {

		
	
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\exe files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("rohitkhemani2@gmail.com");
				
		capture("Rohit36");
		
		
	}
	
	public static void capture(String filename) throws IOException {
		
	File file =	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("C:\\Users\\rohit\\eclipse-workspace\\SeleniumSessions\\src\\SeleniumCode"+filename+".png"));
	}

}
