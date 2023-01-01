package practicing;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticingClass {

    public static void main(String[] args) throws InterruptedException    {  
    	
    	WebDriverManager.chromedriver().setup();
    	ChromeDriver driver = new ChromeDriver();
    	driver.get("https://www.sugarcrm.com/au/request-demo/");
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
    	WebElement ddown = driver.findElement(By.name("employees_c"));
    	Select select = new Select(ddown);
    	
    	WebElement firstOption = select.getFirstSelectedOption();
    	System.out.println(firstOption.getText());
    	
    	select.selectByValue("level1");
    	Thread.sleep(2000);
    	
    	select.selectByVisibleText("51 - 100 employees");
    	Thread.sleep(2000);
    	
    	select.getAllSelectedOptions();
    	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");	
    	
}  
}
