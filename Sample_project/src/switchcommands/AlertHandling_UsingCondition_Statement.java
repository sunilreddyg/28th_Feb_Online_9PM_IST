package switchcommands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AlertHandling_UsingCondition_Statement 
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
		
		
		
		//Write Decision statement to accept condition on alert presented
		if(ExpectedConditions.alertIsPresent().apply(driver) != null)
		{
			System.out.println("Alert presented");
			//Target alert 
			Alert alert=driver.switchTo().alert();
			
			//Capture text on alert
			String alertmsg=alert.getText();
			System.out.println(alertmsg);
			
			//Close alert window
			alert.accept();
		}
		else
		{
			System.out.println("Alert not presented");
		}
		

	}

}
