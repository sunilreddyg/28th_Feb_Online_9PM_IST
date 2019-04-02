package verificationcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_WindowHandling {

	public static void main(String[] args) 
	{
		//browser initiation syntax
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumhq.org");
		driver.manage().window().maximize();
		
		
		//Get Runtime Current window Dynamic ID
		String Runtime_DynamicID=driver.getWindowHandle();
		System.out.println(Runtime_DynamicID);
		
		
		
		/*
		 * Using this runtime dynamic id we can switch to
		 * current window from sun window...
		 */
		
		
		
		

	}

}
