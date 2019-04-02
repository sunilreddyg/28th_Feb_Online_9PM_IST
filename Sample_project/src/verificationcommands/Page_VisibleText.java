package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_VisibleText {

	public static void main(String[] args) 
	{
		//browser initiation syntax
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://cleartrip.com");
		driver.manage().window().maximize();
		
		
		//Identify page
		WebElement Page=driver.findElement(By.tagName("body"));
		//get text visible at webpage
		String Page_Visible_text=Page.getText();
	
		
		//Verify expected text visible at webpage
		if(Page_Visible_text.contains("Fly anywhere. Fly everywhere."))
			System.out.println("text visible at webpage");
		else
			System.out.println("text not visible at webpage");
		

	}

}
