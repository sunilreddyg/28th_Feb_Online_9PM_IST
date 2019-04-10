package switchcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame_Using_WebElement_Locator 
{

	public static void main(String[] args) 
	{
		
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/hotels/");
		driver.manage().window().maximize();
		
				
		//Identify Element at webpage
		WebElement Signin_btn=driver.findElement(By.xpath("//button[@class='login-btn']"));
		Signin_btn.click();
		
		
		//Identify frame at webpage
		WebElement ModalFrame=driver.findElement(By.className("modalIframe"));
		//Switch to frame using webelement referral
		driver.switchTo().frame(ModalFrame);
		
		
		//Identify elemment under frame
		WebElement Mobile_num=driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
		Mobile_num.clear();
		Mobile_num.sendKeys("9086868687");
		
		
		//Get Controls to main page
		driver.switchTo().defaultContent();
		
		
		//Close frame window
		WebElement Close_btn=driver.findElement(By.xpath("(//div[@title='close'])[3]"));
		Close_btn.click();
		
		
		
		
		
		

	}

}
