package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJavaProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ebay.com/");
		
		WebElement element = driver.findElement(By.linkText("Electronics"));
		
		
		Actions act = new Actions(driver);
		
		act.moveToElement(element).perform();
	}

}
