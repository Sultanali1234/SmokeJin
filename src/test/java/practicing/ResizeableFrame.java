package practicing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ResizeableFrame {
	public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/slider/#colorpicker");
	driver.manage().window().maximize();
	
	WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
	driver.switchTo().frame(frame);
	
	WebElement greenSlider = driver.findElement(By.xpath("//*[@id=\"green\"]/span"));
	
	Actions action = new Actions(driver);
	action.dragAndDropBy(greenSlider, 100, 125).perform();
	
	action.dragAndDropBy(greenSlider, -100, -125).perform();

	
	
	}

}
