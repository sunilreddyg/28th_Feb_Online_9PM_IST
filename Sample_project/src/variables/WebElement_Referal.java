package variables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Referal {

	public static void main(String[] args) 
	{
		//browser initiation syntax
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		//Regular syntax
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("darshan@gmail.com");

		
		//Referral WebElement
		WebElement username_element=driver.findElement(By.id("pass"));
		username_element.clear();
		username_element.sendKeys("Hello123456");
		
		
		//Referral WebElement & Locator
		By login_btn_locator=By.id("loginbutton");
		WebElement login_button=driver.findElement(login_btn_locator);
		login_button.click();
		
		
		
	}

}
