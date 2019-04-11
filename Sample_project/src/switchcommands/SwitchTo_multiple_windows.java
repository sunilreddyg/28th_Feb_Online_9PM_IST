package switchcommands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_multiple_windows {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		//Switch to main window
		String mainwindow=driver.getWindowHandle();
		
		System.out.println("main window Dynamic id => "+driver.getWindowHandle());
		
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Check PNR Status']")).click();
		Thread.sleep(2000);
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Trains availability calendar']")).click();
		Thread.sleep(2000);
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Cancel trains tickets']")).click();
		Thread.sleep(2000);
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Rail Tour Packages']")).click();
		Thread.sleep(2000);
		
		
		//Get All window Dynamic ID's Open throw webdriver.
		Set<String> AllwindowIDS=driver.getWindowHandles();
		
		//Apply foreach loop
		for (String Eachwindow : AllwindowIDS) 
		{
			//Apply switch to all window iteation wise
			driver.switchTo().window(Eachwindow);
			//After switch capture every window title
			String Runtime_title=driver.getTitle();
			
			//Write a decision on window title match
			if(Runtime_title.contains("Cancel Train Bookings"))
			{
				break;
			}
			
		}
		
		System.out.println("Current windows focused on => "+driver.getTitle());
		
	}

}
