package webdriver_Scripting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_InterFace {

	public static void main(String[] args) 
	{
		
		
		/*
		 * WebDriver:-->
		 * 		=> WebDriver is a interface class it can
		 * 			implements all browser instances supported
		 * 			by selenium.
		 */
		
		//Set runtime property aling with chromedriver location
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//Launch browser and store into Webdriver interface referral
		WebDriver driver=new ChromeDriver();
		//load webpage into browser window
		driver.get("http://facebook.com");
		//maximize browser window [Optional]
		driver.manage().window().maximize();
		
		
		
		
		
		
		//Identify email editbox 
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("9030248855");
		
		//Identify password editbox
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys("Hello12345");
		
		
		//click on Signin button
		driver.findElement(By.id("loginbutton")).click();
		
		
		
		
		
		
		

	}

}
