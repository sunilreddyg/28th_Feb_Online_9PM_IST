package pageobjects.WithConstructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run_Gmail {

	public static void main(String[] args) throws Exception 
	{
		
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		
		
		Gmail_Signin signin=new Gmail_Signin(driver);
		
		signin.Email_Editbox.clear();
		signin.Email_Editbox.sendKeys("qadarshan@gmail.com");
		
		signin.Email_next_btn.click();
		Thread.sleep(5000);
		
		signin.Password_Editbox.clear();
		signin.Password_Editbox.sendKeys("Hello");
		
		signin.Password_next_btn.click();

	}

}
