package DemoTest.Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		//Launch chrome browser
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJavaProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println("Page title: " +title);
		
		System.out.println("Current url" + driver.getCurrentUrl());
		//driver.close();

	}

}
