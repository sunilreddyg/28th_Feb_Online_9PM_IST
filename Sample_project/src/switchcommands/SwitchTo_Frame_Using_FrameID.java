package switchcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame_Using_FrameID {

	public static void main(String[] args) {
		
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/account/trips?src=manageTrips");
		driver.manage().window().maximize();
		
		
		//Switch to frame using id
		driver.switchTo().frame("modal_window");
		
		
		//Identify email editbox
		WebElement Email_editbox=driver.findElement(By.id("email"));
		Email_editbox.clear();
		Email_editbox.sendKeys("qadarshan@gmail.com");
		
		//IDentify tripid editbox under frame
		WebElement tripId=driver.findElement(By.id("tripidSecond"));
		tripId.clear();
		tripId.sendKeys("0808098098");
		
		
		//Switch controls back to mainpage
		driver.switchTo().defaultContent();
		
		//Identify link at page
		WebElement flights=driver.findElement(By.linkText("Flights"));
		flights.click();
		
		
		
		
		

}

}
