package switchcommands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Alert 
{

	public static void main(String[] args) throws Exception
	{
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/");
		driver.manage().window().maximize();
		
		
		/*
		 * Testcase:--> Click search button without enter course
		 * 				name and keyword
		 * 
		 * Expected:--> System should prompt alert window with
		 * 				appropriate error message.
		 */
		
		WebElement Search_btn=driver.findElement(By.xpath("//input[@value='Search']"));
		//Search_btn.click();
		Thread.sleep(5000);  //timeout to wait for alert
		
		
		//Target alert 
		Alert alert=driver.switchTo().alert();
		
		//Capture text on alert
		String alertmsg=alert.getText();
		System.out.println(alertmsg);
		
		//Close alert window
		alert.accept();
		
		
		System.out.println("Run continued");
		
		
		/*
		 * Capture text on alert window
		 * 
		 * 	driver.switchTo().alert().getText();
		 * 
		 * Accept popup window    [It close window]
		 * 	
		 * 	driver.switchTo().alert().accept();
		 * 
		 * Dismiss alert window   [It close window]
		 * 
		 * 	driver.switchTo().alert().dismiss();
		 * 
		 * Send text to popup-window  [Prompt window]
		 * 
		 * 	driver.switchTo().alert().sendkeys("text");
		 */
		
		
		
		/*	
		 * Alert Exceptions:-->
		 * 		UnhandledAlertException
		 * 		NoAlertPresentedException
		 * 
		 * unhandledAlertException:-->
		 * 			=> when alert presented at webpage,Incase user
		 * 				try to hadle webpage elements without proper
		 * 				closing alert system throw exception.
		 * 
		 * NoAlertpresentedException:-->
		 * 			=> When user type syntax switch to alert
		 * 			   where it was not presented.
		 * 		
		 */
		
		

	}

}
