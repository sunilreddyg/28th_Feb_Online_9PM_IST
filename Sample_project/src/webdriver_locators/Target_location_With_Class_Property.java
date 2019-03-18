package webdriver_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Target_location_With_Class_Property 
{

	public static void main(String[] args) throws Exception
	{

		//browser initiation syntax
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://outlook.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	
		
		//Click Signin  link
		driver.findElement(By.xpath("//a[@class='linkButtonSigninHeader'][contains(.,'Sign in')]")).click();
		
		
		/*
		 * Htmlsource:-->
		 * 		<input  class="form-control ltr_override" ></input>
		 * 
		 * 	Note:--> Class property having spaces. That means Selected
		 * 				nodes comes under two classes..
		 * 	
		 * 	Note:--> To recognize element classname property use only
		 * 			single class property.
		 * 
		 *  Note:--> Don't write class property along with spaces. If
		 *  		we identify class property with space, System throws Exception
		 *  		"InvalidSelector-Exception"
		 */
		
		driver.findElement(By.className("form-control")).clear();
		driver.findElement(By.className("form-control")).sendKeys("sunilreddy.gajjala@outlook.com");

		
		//Click Next button with class property
		driver.findElement(By.className("btn-primary")).click();
		
		
		
		
	}

}
