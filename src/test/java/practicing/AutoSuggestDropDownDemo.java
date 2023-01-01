package practicing;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestDropDownDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//span[text()='From']")).click();

		WebElement from = driver.findElement(By.xpath("//input[@placeholder='From']"));
		Thread.sleep(30000);
		from.sendKeys("Sydney");
		Thread.sleep(30000);
		from.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(30000);
		from.sendKeys(Keys.ENTER);
		Thread.sleep(30000);

//    	driver.findElement(By.xpath("//input[@placeholder='From']")).click();
//    	driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Sydney");
//    	driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ARROW_DOWN);
//    	driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(Keys.ENTER);

	}
}
