package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FacebookTooTip {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\SeleniumJavaProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String actualTooltip= driver.findElement(By.xpath("//a[@href='/reg/']")).getDomAttribute("title");
		String expectedTooltip ="Sign up for Facebook";
		
		if(actualTooltip.equals(expectedTooltip))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		

	}

}
