package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait_for_title 
{

	public static void main(String[] args) 
	{
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("http://selenium.org");
		driver.manage().window().maximize();
		System.out.println("window maximized");
		
		
		String exp_title="Selenium - Web Browser Automation";
		
		//Create object for explicit wait
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleIs(exp_title));
		System.out.println("title verified");
		
		
		
		
		

	}

}
