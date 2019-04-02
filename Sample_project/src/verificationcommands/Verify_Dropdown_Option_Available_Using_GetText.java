package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Dropdown_Option_Available_Using_GetText {

	public static void main(String[] args) 
	{
		//browser initiation syntax
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		
		//identify dropdown
		WebElement State_Dropdown=driver.findElement(By.xpath("//select[@name='stateName']"));
		//Get visible options at dropdown
		String Dropdownlist=State_Dropdown.getText();
	
		//Verify expected option available dropdown
		if(Dropdownlist.contains("Gujarat"))
		{
			System.out.println("Expected option available at dropdown");
		}
		else
		{
			System.out.println("expected option not available at dropdown");
		}
			
}

}
