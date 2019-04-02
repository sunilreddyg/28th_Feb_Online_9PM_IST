package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_pagesource 
{

	public static void main(String[] args)
	{
		//browser initiation syntax
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumhq.org");
		driver.manage().window().maximize();
	
		
		//capture Runtime pagesource
		String Runtime_pageSource=driver.getPageSource();
		
		
		//Verify Html Element presented source...
		if(Runtime_pageSource.contains("q"))
		{
			System.out.println("Elemnet presented at source");
			WebElement Search_editbox=driver.findElement(By.id("q"));
			Search_editbox.clear();
			Search_editbox.sendKeys("Selenium");
		}
		else
		{
			System.out.println("Element not available at source");
		}
		
		
		/*
		 * The above situvation we can use to handle dynamic element at pagesource.
		 */
		
		
		
		//Verify text available at page source
		if(Runtime_pageSource.contains("What is Selenium?"))
		{
			System.out.println("text presented at source");
		}
		else
		{
			System.out.println("text not presented at source");
		}
		
		
		
	}

}
