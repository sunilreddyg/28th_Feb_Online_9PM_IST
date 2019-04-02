package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_page_url {

	public static void main(String[] args) 
	{
		
		//browser initiation syntax
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumhq.org");
		driver.manage().window().maximize();
		
		
		//Click download tab
		WebElement Download_Tab=driver.findElement(By.xpath("//a[@title='Get Selenium']"));
		Download_Tab.click();
	
		
		String exp_url="https://www.seleniumhq.org/download/";
		
		
		//Capture runtime url
		String Runtime_url=driver.getCurrentUrl();

		//Verify Runtime url contains expected url
		if(Runtime_url.contains(exp_url))
		{
			System.out.println("Expected url presented");
		}
		else
		{
			System.out.println("Expected url not presented");
		}
		
}

}
