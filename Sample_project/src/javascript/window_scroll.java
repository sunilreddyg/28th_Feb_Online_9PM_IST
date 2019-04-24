package javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_scroll 
{

	public static void main(String[] args) throws Exception 
	{
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
	
		
		
		
		//Create Interface for JsExecutor
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		
		//Using javasript executor scroll down window
		js.executeScript("window.scroll(100,700)");
		
		
		
		//Scroll window left to right
		js.executeScript("window.scroll(800,100)");
				
		
	}

}
