package mouse_and_keyboard_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sendkeys_Using_KeyboardActions 
{

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		
		//Identify From edibtox
		WebElement FromCity=driver.findElement(By.xpath("//input[@id='fromCity']"));
		FromCity.click();
		
		//Enable Keyboard interfaction on automation browser
		Actions action=new Actions(driver);
		
		//Peform keyboard shortcuts
		action.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);
		
		action.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);

		
		action.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);

		action.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(2000);

		action.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);


	}

}
