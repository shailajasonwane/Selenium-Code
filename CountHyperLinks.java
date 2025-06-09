package DemoTest.Test1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountHyperLinks {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\SeleniumJavaProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.calculator.net/");
		List <WebElement> linkElements = driver.findElements(By.tagName("a"));	
		System.out.println("List of links" +linkElements.size());
		
		for(WebElement el :linkElements) {
			System.out.println(el.getText());
		}
		driver.close();
		
	}

}
