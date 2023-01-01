package practicing;

import java.util.Iterator;
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

public class IframeDemo {

	WebDriver driver;
	
	@Before
	public void openBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/au/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	    @Test
		public void radioButton() throws InterruptedException  {
	    	
	    	driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/div/div[2]/div/div[1]/div/div[1]/div/a/span")).click();
	    	Thread.sleep(4000);
	    	
	    	Set<String> windowsHandles = driver.getWindowHandles();
	    	System.out.println(windowsHandles);
	    	
	    	Iterator<String> iterator = windowsHandles.iterator();
	    	String parentWindow = iterator.next();
	    	System.out.println(parentWindow);
	    	
	    	String childWindow = iterator.next();
	    	System.out.println(childWindow);
	    	
	    	driver.switchTo().window(childWindow);
	    	
	    	driver.findElement(By.name("UserFirstName")).sendKeys("CRV");
	    	driver.findElement(By.name("UserLastName")).sendKeys("Academy");
	    	
	    	driver.switchTo().window(parentWindow);
	    	
	    	
	    	

	}

}
