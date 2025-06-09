package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {

	public static void main(String[] args) {
		//Launch chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJavaProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/dragabble");
		
		WebElement source = driver.findElement(By.id("draggableExample-tab-simple"));
		WebElement targetElement = driver.findElement(By.id("dragBox"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(source,targetElement).perform();
		

	}

}
