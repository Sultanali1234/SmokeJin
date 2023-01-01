package practicing;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintAllLinks {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/au/form/signup/freetrial-elf-v2/?d=70130000000EqoP");
		driver.manage().window().maximize();
		
		List<WebElement> alltags = (List<WebElement>) driver.findElementByTagName("option");
		System.out.println(alltags.size());
		
		for(int i =0; i< alltags.size(); i++) {
			System.out.println("Links on page are:" + alltags.get(i).getText());
		}
		
	}

}
