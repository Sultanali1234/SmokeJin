package practicing;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	WebDriver driver;
	
	@Before
	public void openBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://finance.yahoo.com/");
		driver.manage().window().maximize();
		
	//  Step 1 - Switch to frame whic has that particular table
	//  Step 2 - Get the number of rows
	//  Step 3 - Get the number of columns
	//  Step 4 - iterate rows and columns and get text and print it	
		
//		WebElement frame1 = driver.findElement(By.id("announcements-frame"));
//		driver.switchTo().frame(frame1);
		
	//  Total number of rows	
		List<WebElement> rowelements = driver.findElements(By.xpath("//*[@id=\"data-util-col\"]/section[4]/table/tbody/tr"));
		System.out.println(rowelements.size());
		int rowsize = rowelements.size(); // this is for loop purpose only
	
	//  Total number of columns
		List<WebElement> colelements = driver.findElements(By.xpath("//*[@id=\"data-util-col\"]/section[4]/table/tbody/tr[1]/td"));
		System.out.println(rowelements.size());
		int colsize = rowelements.size(); // this is for loop purpose only
	
	//  iterate rows and columns
		for(int i=1; i<=rowsize; i++) {
			for(int j=1; j<= colsize; j++) {
				System.out.println(driver.findElement(By.xpath("//*[@id=\"data-util-col\"]/section[4]/table/tbody/tr["+ i +"]/td[" + j + "]"))
						.getText()+ "  ");
			}
			System.out.println();
		}

	}

}
