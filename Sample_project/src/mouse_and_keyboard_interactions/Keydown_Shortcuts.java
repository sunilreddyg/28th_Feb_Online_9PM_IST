package mouse_and_keyboard_interactions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keydown_Shortcuts {

	public static void main(String[] args) throws Exception 
	
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		//Enable keyboard controls on automation browser
		Actions action=new Actions(driver);
		
		action.keyDown(Keys.CONTROL)
		.sendKeys("s").build().perform();

	}

}
