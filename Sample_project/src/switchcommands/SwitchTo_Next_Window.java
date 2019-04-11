package switchcommands;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Next_Window 
{

	public static void main(String[] args) throws Exception 
	{
		//browser initiation
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		//Capture current window dynamic ID
		String MainwindowID=driver.getWindowHandle();
		
		System.out.println("before switch page title is => "+driver.getTitle());
		
		
		//Identify external link and click to open at private window.
		WebElement Instagram_link=driver.findElement(By.xpath("//a[contains(.,'Instagram')]"));
		Instagram_link.click();
		Thread.sleep(10000);
		
		
		//Get All dynamic window id's open throw webdriver program.
		Set<String> AllDynamicIDS=driver.getWindowHandles();
		
		//Apply foreach loop
		for (String EachwindowID : AllDynamicIDS) 
		{
			if(!EachwindowID.equals(MainwindowID))
			{
				driver.switchTo().window(EachwindowID);
				break;
			}
		}
		
		
		System.out.println("Window Focused on => "+driver.getTitle());
		Thread.sleep(5000);
		
		
		//IDentify location at Instargram window
		WebElement Mobile_num=driver.findElement(By.xpath("//input[@name='emailOrPhone']"));
		Mobile_num.clear();
		Mobile_num.sendKeys("7897987878");
		Thread.sleep(5000);  
		
		//Switch controls back to mainwindow
		driver.switchTo().window(MainwindowID);

	}

}
