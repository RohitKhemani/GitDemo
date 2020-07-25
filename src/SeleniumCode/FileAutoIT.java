
package SeleniumCode;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileAutoIT {
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\exe files\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();

		driver.get("https://altoconvertpdftojpg.com");
		
		screenshot("Page1");
		

	}

	
	public static void screenshot(String filename) throws IOException {
		
		File ts = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(ts, new File("C:\\Users\\rohit\\eclipse-workspace\\SeleniumSessions\\Evidences" +filename+ ".png"));
	}
}
