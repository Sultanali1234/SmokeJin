package practicing;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonDemos {

	WebDriver driver;
	@Before
	public void openBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.singaporeair.com/en_UK/us/home#/book/bookflight");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	    @Test
		public void radioButton() {

	//	WebElement radio2 = driver.findElement(By.id("redeemFlights"));
//		WebElement radio1 = driver.findElement(By.id("bookFlights"));
//		radio2.click();
	    driver.findElement(By.xpath("//*[@id=\"redeemFlights\"]")).click();
		
//		System.out.println(radio1.isSelected());
//		System.out.println(radio2.isSelected());
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");	
		
	}

}
