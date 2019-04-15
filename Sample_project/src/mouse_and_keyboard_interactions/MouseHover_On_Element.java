package mouse_and_keyboard_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover_On_Element 
{

	public static void main(String[] args)
	{
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		
		
		/*
		 * Enable mouse and keyboard interactions on automation browser.
		 */
		Actions action=new Actions(driver);
		
		//Identify location
		WebElement Category=driver.findElement(By.xpath("//span[contains(.,'Category')]"));
		//Perform hover action on element
		action.moveToElement(Category).perform();
		
		
		//Identify sub category
		WebElement sub_Mobile_and_Computer=driver.findElement(By.xpath("//span[@class='nav-text'][contains(.,'Mobiles, Computers')]"));
		//Perform mouse hover action on element
		action.moveToElement(sub_Mobile_and_Computer).perform();
		
		
		//Identify Sub category
		WebElement Laptops=driver.findElement(By.xpath("//span[contains(.,'Laptops')]"));
		//Perform click action using Mouse interaction.
		action.click(Laptops).perform();
	}

}
