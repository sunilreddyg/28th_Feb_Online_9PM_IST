package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait_Example {

	public static void main(String[] args)
	{
		
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		System.out.println("window maximized");
	
		
		//identify Element at webpage
		driver.findElement(By.id("email"));
		System.out.println("Element found at DOM--HtmlSource");
		
		
		
		
		
		
		

	}

}
