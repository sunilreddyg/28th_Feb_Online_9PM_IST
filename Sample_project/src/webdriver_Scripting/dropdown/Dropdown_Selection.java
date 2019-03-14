package webdriver_Scripting.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Selection 
{

	public static void main(String[] args) throws InterruptedException
	{
		//browser initiation syntax
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		
		/*
		 * => All dropdown selection commands available at
		 * 		"Select" Class. To Use dropdown selection methods
		 * 		we should create object for "Select" Class
		 */
		new Select(driver.findElement(By.id("customState")))
		.selectByVisibleText("Kerala");  //Option name with case-sensitive
		Thread.sleep(4000);
		
		
		
		//Select City drodpown option using option value property
		new Select(driver.findElement(By.id("customCity")))
		.selectByValue("kochi");
		
		
		//Identify locality editbox and type any near by locatity address
		driver.findElement(By.id("customLocality")).clear();
		driver.findElement(By.id("customLocality")).sendKeys("Society Road");

		//Select radius dropdown using index number
		new Select(driver.findElement(By.id("customRadius")))
		.selectByIndex(3);   //Enter index in number format...
		
		
		//Select checkbox  [Use click command to select checkbox]
		driver.findElement(By.id("amenity_category_order_types49")).click();
		
		
		//Click search button using xpath
		driver.findElement(By.xpath("//input[@value='SEARCH']")).click();
		
		
		
	}

}
