package webdriver_Scripting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_Keyboard_Shrotcuts 
{

	public static void main(String[] args) 
	{
		
		//Set runtime property aling with chromedriver location
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//Launch browser and store into Webdriver interface referral
		WebDriver driver=new ChromeDriver();
		//load webpage into browser window
		driver.get("http://facebook.com");
		//maximize browser window [Optional]
		driver.manage().window().maximize();
		
		
		
		//identifying firstname editbox
		driver.findElement(By.id("u_0_j")).clear();
		driver.findElement(By.id("u_0_j"))
		.sendKeys("Arjun",Keys.TAB
				,"Krishna",Keys.TAB
				,"Arunkrishna@gmail.com",Keys.TAB
				,"Arunkrishna@gmail.com",Keys.TAB
				,"Hello12334");
		
		
		//Select Dropdown option using keyboard shortcuts
		driver.findElement(By.id("day")).sendKeys("21");
		
		//select month dropdown option using keyboard shorcuts
		driver.findElement(By.id("month"))
		.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		
		
		
		//Select radio button using keyboard shortcuts
		driver.findElement(By.id("u_0_9")).sendKeys(Keys.SPACE);
		
		
		
		
	}

}
