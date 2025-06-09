package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumJavaProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		String actualTooTip= driver.findElement(By.xpath("//input[@id='name']")).getDomAttribute("placeholder");
		String expectedTooTip = "Enter Name";
		
		if (actualTooTip.equals(expectedTooTip))
		{
			System.out.println("Test Passed");
			
		}
		else
		{
			System.out.println("Test failed");
		}
		
		}

}
