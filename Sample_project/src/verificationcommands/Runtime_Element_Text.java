package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_Element_Text {

	public static void main(String[] args)
	{
		
		/*
		 * Testcase:-->
		 * 		verify flightsearch functinality without enter data
		 * Steps:-->
		 * 		Enter site url  http://cleartrip.com
		 * 		Click Search flight button without enter details
		 * Expected:-->
		 * 		System should display appropriate error message
		 */
		
		
		//browser initiation syntax
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://cleartrip.com");
		driver.manage().window().maximize();

		
		WebElement Search_flight=driver.findElement(By.xpath("//input[@id='SearchBtn']"));
		Search_flight.click();
		
		
		String Exp_Home_errmsg="Sorry, but we can't continue until you fix everything that's marked in RED";

		
		//Identify text location
		WebElement Home_error_location=driver.findElement(By.xpath("//div[@id='homeErrorMessage']"));
		//Using location capture text
		String Actual_error_msg=Home_error_location.getText();
		
		
		//Verify Actual and expected error message
		if(Actual_error_msg.equals(Exp_Home_errmsg))
			System.out.println("As expected error message display on invalid search");
		else
			System.out.println("Test fail as expected error message not displayed on invalid search");
	}

}
