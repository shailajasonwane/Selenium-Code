package DemoTest.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFiles {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJavaProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/upload-download");
		
		driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("D:\\ShailajaSonwane_Resume.pdf");
		
	}

}
