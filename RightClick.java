package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		//Launch chrome browser
				System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJavaProject\\Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.get("https://demoqa.com/buttons");
				
				/*WebElement Button = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
				Actions act = new Actions(driver);
				act.contextClick(Button).perform(); //Right Click Action */
				
				WebElement button = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
				Actions act = new Actions(driver);
				act.doubleClick(button).perform();//Double Click Action 
				
			
				
				

	}

}
