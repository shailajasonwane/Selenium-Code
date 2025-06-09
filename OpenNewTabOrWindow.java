package DemoTest.Test1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewTabOrWindow {

	public static void main(String[] args) {
		
		//Launch Browser

	System.setProperty("webdriver.chrome.driver","D:\\SeleniumJavaProject\\Drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	//Open URL
	driver.get("https://www.google.com/");
	System.out.println("First page " + driver.getTitle());
	
	//Open New Tab
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://www.facebook.com/");
	System.out.println("Second page " + driver.getTitle());
	
	//get window handles of open windows
	Set<String> windowHandles = driver.getWindowHandles();
	List <String> handles = new ArrayList <String>();
	handles.addAll(windowHandles);
	
	driver.close();
	driver.switchTo().window(handles.get(0)); //Switch to google.com
	System.out.println("First page " + driver.getTitle());
	
	}

}
