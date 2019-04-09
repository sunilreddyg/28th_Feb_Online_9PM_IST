package switchcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Active_Element 
{

	public static void main(String[] args) throws Exception
	{
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/free-job-alerts");
		driver.manage().window().maximize();
		
		
		//Identify Expected salary list-menu
		WebElement Expected_Salary=driver.findElement(By.xpath("//input[@id='cjaMinSal']"));
		Expected_Salary.click();
		Thread.sleep(3000);
		
		
		//Switch Active element at webpage
		driver.switchTo().activeElement()
		.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
		
		
		
		

	}

}
