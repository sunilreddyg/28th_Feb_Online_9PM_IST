package webdriver_Scripting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoComplete_Editbox {

	public static void main(String[] args) throws Exception 
	{
		
		//browser initiation syntax
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://cleartrip.com");
		driver.manage().window().maximize();
		Thread.sleep(5000); //Timeout until notification displayed
		
		
		
		//Identify From Editox and type referral keyword
		driver.findElement(By.id("FromTag")).clear();
		driver.findElement(By.id("FromTag")).sendKeys("HYD");
		Thread.sleep(4000);  //Timeout to display suggestions.
		//Select Suggestion by clicking
		driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
		
		
		
		//IDentify TO editbox and type referral keyword
		driver.findElement(By.id("ToTag")).clear();
		driver.findElement(By.id("ToTag")).sendKeys("JAI");
		Thread.sleep(4000);//Timeout to display suggestions.
		//Select Suggestion by clicking
		driver.findElement(By.linkText("Jaipur, IN - Sanganeer (JAI)")).click();
		
		
		//Deparute date calendar autopopulate on Arrival city selection
		//Select date from datepicker
		driver.findElement(By.linkText("26")).click();
		
		
		//Select Dropdown
		new Select(driver.findElement(By.id("Adults")))
		.selectByVisibleText("5");
		
		
		//clicking button 
		driver.findElement(By.id("SearchBtn")).click();
		

	}

}
