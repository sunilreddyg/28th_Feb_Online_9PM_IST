package switchcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame_Using_NaivigationCommand {

	public static void main(String[] args)
	{
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/account/trips?src=manageTrips");
		driver.manage().window().maximize();
		
		
		//Navigate to frame
		driver.navigate().to("https://www.cleartrip.com/signinstatic/tripidlogin.shtml?popup=no&guest=true");
		
		
		//Identify email editbox
		WebElement Email_editbox=driver.findElement(By.id("email"));
		Email_editbox.clear();
		Email_editbox.sendKeys("qadarshan@gmail.com");
		
		//IDentify tripid editbox under frame
		WebElement tripId=driver.findElement(By.id("tripidSecond"));
		tripId.clear();
		tripId.sendKeys("0808098098");
		
				
		//Get control back to page
		driver.navigate().back();
		
		
				
	}

}
