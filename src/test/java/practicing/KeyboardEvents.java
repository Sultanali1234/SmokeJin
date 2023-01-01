package practicing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardEvents {
	public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://extendsclass.com/text-compare.html");
	driver.manage().window().maximize();
	
	WebElement sourceTextArea = driver.findElement(By.xpath("//*[@id=\"dropZone\"]//div[5]/pre/span"));
	
	Actions action = new Actions(driver);
	action.keyDown(sourceTextArea, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
	Thread.sleep(2000);
	
	WebElement destinationTextArea = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]//div[5]/div[3]/pre/span"));
	Thread.sleep(2000);
	action.keyDown(destinationTextArea, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
	
	}
}
