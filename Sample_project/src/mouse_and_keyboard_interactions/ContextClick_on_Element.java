package mouse_and_keyboard_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick_on_Element 
{

	public static void main(String[] args) throws Exception 
	{
		
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		
		/*
		 * Enable mouse and keyboard interactions on automation browser.
		 */
		Actions action=new Actions(driver);
		
		
		//identify location
		WebElement Element=driver.findElement(By.xpath("//span[text()='right click me']"));
		//Perform right click on location
		action.contextClick(Element).perform();
		Thread.sleep(4000);
		
				
		//Click Delete option from context menu
		WebElement Delete_option=driver.findElement(By.xpath("//span[text()='Delete']"));
		Delete_option.click();
		
		//Close alert window
		driver.switchTo().alert().accept();
		
		
		
	}

}
