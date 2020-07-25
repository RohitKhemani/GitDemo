package SeleniumCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadData {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\exe files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		
		
		Xls_Reader reader = new Xls_Reader("F:\\Excel\\TravelWebsiteData.xlsx");
		
	int rowcount =	reader.getRowCount("RK");
	
	
		
		for(int rowNum=2; rowNum<=rowcount; rowNum++) {
			
			
			String FROM = reader.getCellData("RK", "FROM" , rowNum);

			
		
	



	
	
	
		driver.findElement(By.xpath("//input[@id='travel_from']")).clear();
		
driver.findElement(By.xpath("//input[@id='travel_from']")).sendKeys(FROM);


	
		}
	
		
		

	}

}
