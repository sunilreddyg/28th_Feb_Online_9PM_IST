package webdriver_Scripting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Login_Keybord_Shortcuts 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		
		//Identify email editbox
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId"))
		.sendKeys("qadarshan@gmail.com",Keys.ENTER);
		
		
		/*
		 * Sendkeys:--> command accepts "character sequences" and
		 * 			keyboard shortcuts
		 */
		
		
		Thread.sleep(5000);
		
		
		//Identify password editbox
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password"))
		.sendKeys("Hello234",Keys.ENTER);
		
		
		
		
		
		
		
		
		
	}

}
