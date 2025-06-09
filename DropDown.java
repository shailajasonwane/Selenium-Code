package DemoTest.Test1;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	public static void main(String[] args)
{
	
	System.setProperty("webdriver.chrome.driver","D:\\SeleniumJavaProject\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	//open webpage
	driver.get("https://www.udyog-aadhar.com/");
	
	WebElement element = driver.findElement(By.id("txtCtr"));
	
	Select dropdown = new Select(element);
	//dropdown.selectByVisibleText("OBC");
	//dropdown.selectByValue("SC");
	dropdown.selectByIndex(3);
	
	if(dropdown.isMultiple())
	{
		System.out.println("Dropdown is multiple");
		
	}
	else
	{
		System.out.println("Dropdown is not multiple");
	}
	
	List <WebElement> alldropdowns= dropdown.getOptions();
	
	for(WebElement el :alldropdowns )
	{
		System.out.println(el.getText());
	}
	//driver.close();
	
}

}
