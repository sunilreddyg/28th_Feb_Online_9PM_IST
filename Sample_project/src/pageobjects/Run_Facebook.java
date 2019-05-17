package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Run_Facebook 
{

	public static void main(String[] args) 
	{
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		//Get @Find elemnets using factory class
		FB_Signin signin=PageFactory.initElements(driver, FB_Signin.class);
		
		signin.Email_editbox.clear();
		signin.Email_editbox.sendKeys("qadarshan@gmail.com");
		
		signin.Password_editbox.clear();
		signin.Password_editbox.sendKeys("Hello1234");
		
		signin.Signin_btn.click();

	}

}
