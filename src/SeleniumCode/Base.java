package SeleniumCode;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	
	
	public static void initialisation() {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\exe files\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();

		driver.get("https://www.google.com");

	}

	
		public static void failed(String testMethodName) throws IOException {
		
			
		File file = 	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("C:\\Users\\rohit\\eclipse-workspace\\SeleniumSessions\\Evidences" +testMethodName+ ".png"));
		
		
		
	}
}
