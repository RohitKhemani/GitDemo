package PracticeSessions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetUp {
	
	public static WebDriver driver;

	
	public static void info() {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\exe files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.get("https://www.gmail.com");
	}
	
	
	public static void screenshot(String testmethodname) throws IOException {
		
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("C:\\Users\\rohit\\eclipse-workspace\\SeleniumSessions\\Evidences" +testmethodname+ ".png"));
		
	}
	
}
