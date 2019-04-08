package validationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class IsDisplayed_For_Static_Elements 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com/");
		driver.manage().window().maximize();
		
		
		//Identify Email Editbox
		WebElement Email_eb=driver.findElement(By.id("identifierId"));
		
	
		if(Email_eb.isDisplayed() && Email_eb.isEnabled())
		{
			Email_eb.clear();
			Email_eb.sendKeys("9030248855");
		}
		else
		{
			System.out.println("element not visible or enabled at webpage");
		}
		
		
	

		/*
		 * Note:-->
		 * 		By writing conditional scripting we can avoid below exception
		 * 
		 * ElementNotvisibleException   ==> When user perform action on hidden element  
		 * InvalidElementstateException ==> When user perform action on disabled element
		 */
		
		
		

	
			
			
		
		
		
		
		
		
		

	}

}
