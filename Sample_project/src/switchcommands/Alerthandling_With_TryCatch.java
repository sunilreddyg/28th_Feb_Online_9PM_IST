package switchcommands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerthandling_With_TryCatch 
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
		Search_btn.click();
		Thread.sleep(5000);  //timeout to wait for alert
		
		
		
		try {
			
			
			//Target alert 
			Alert alert=driver.switchTo().alert();
			
			//Capture text on alert
			String alertmsg=alert.getText();
			System.out.println(alertmsg);
			
			//Close alert window
			alert.accept();
		
	
		} catch (NoAlertPresentException e) {
			System.out.println(e.getMessage());
		
		}	
		
		
		System.out.println("Run Continued");

	}

}
