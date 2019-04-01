package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Runtime_PageTitle {

	public static void main(String[] args) 
	{
	
		/*
		 * Testcase:--> Verify correct homepage displayed for seleniumhq 
		 * Steps:--> launch browser and enter site url  https://seleniumhq.org
		 * Expected:--> System should load required webpage along with Expected title
		 * 					"Selenium - Web Browser Automation"
		 */
		
		
		//browser initiation syntax
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumhq.org");
		driver.manage().window().maximize();
		
		
		String exp_title="Selenium - Web Browser Automation";
		
		//Get Curretn window runtime title.
		String Runtime_title=driver.getTitle();
		
		
		//Verify equal comparison between two strings
		boolean flag=Runtime_title.equalsIgnoreCase(exp_title);
		System.out.println("Site title verified status is => "+flag);
		

		//Write decision statement to continue script on expected title presented
		if(flag==true)
		{
			System.out.println("Expected title presented for selniumhq homepage");
			
			//Click download tab
			WebElement Download_Tab=driver.findElement(By.xpath("//a[@title='Get Selenium']"));
			Download_Tab.click();
			
			//Verify Download page title
			if(driver.getTitle().equals("Downloads"))
				System.out.println("Expected title presented for download tab");
			else
				System.out.println("wrong title presented for download tab");
		}
		else
		{
			System.out.println("Wrong title preseted for seleniumhq homepage");
		}
		
		
		

	}

}
