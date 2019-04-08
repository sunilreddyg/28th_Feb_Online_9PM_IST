package validationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed_For_Runtime_Elements 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://cleartrip.com/");
		driver.manage().window().maximize();
		
		
		//target more options link
		WebElement More_options=driver.findElement(By.xpath("//a[@id='MoreOptionsLink']"));
		
		/*
		 * Click More options. Expected "Class of travel" and "Preffered
		 * airlines" element should visible at webpage
		 */
		More_options.click();
		Thread.sleep(5000);
		
		WebElement Travel_Class=driver.findElement(By.xpath(".//*[@id='Class']"));
		WebElement Airlines=driver.findElement(By.xpath("//input[@name='airline']"));
		
		
		if(Travel_Class.isDisplayed() &&  Airlines.isDisplayed())
			System.out.println("Testpass:--> As expected both visible at webpage");
		else
			System.out.println("Testfail:-->Travel class and airlines elemnet expected to be hidden");
		
		
		
		/*
		 * Click More options when  "Class of travel" and "Preffered
		 * airlines" elements visible at webpage
		 * Expected:--> Should hide both elements..
		 */
		More_options.click();
		Thread.sleep(5000);
		
		
		
		
		if(!Travel_Class.isDisplayed() &&  !Airlines.isDisplayed())
			System.out.println("Testpass:--> As expected both element hidden");
		else
			System.out.println("Testfail:--> both elements are visible");
	
	}

}
