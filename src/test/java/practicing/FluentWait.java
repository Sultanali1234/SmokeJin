package practicing;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWait {
	public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.ebay.com.au/");
	driver.manage().window().maximize();
	
	WebElement element = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
	
	Actions action = new Actions(driver);
	action.moveToElement(element).perform();
	
//
//	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//			.withTimeout(Duration.ofSeconds(10))
//            .pollingEvery(Duration.ofSeconds(2)).withMessage("")
//            .ignoring(NoSuchElementException.class);
	
	}
}
