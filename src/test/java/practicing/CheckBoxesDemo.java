package practicing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxesDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		
		WebElement radio = driver.findElement(By.xpath("//*[@id=\\\"checkboxes\\\"]/input[2]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(radio);
		actions.perform();
		
		System.out.println(driver.findElements(By.xpath("//*[@id=\"checkboxes\"]/input")).size());
//		driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]")).click();
//		Thread.sleep(2000);
		

	}

}
