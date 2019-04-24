package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js_Executor_commands {

	public static void main(String[] args) throws Exception 
	{
		
		//browser inititation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		
		//Enable javascript executor on automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		
		//Type text into editbox using javascript-executor
		js.executeScript("document.getElementById('u_0_j').value='Arjun'");
		js.executeScript("document.getElementById('u_0_l').value='Krishna'");
		
		
		//Identify locaiton using selenium
		WebElement MobileNumber=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		//Javascript using xpath locator
		js.executeScript("arguments[0].value='Arjunkrishna@gmail.com'", MobileNumber);
		
		
		
		//Identify locatio using selenium
		WebElement password=driver.findElement(By.cssSelector("input[data-type='password']"));
		//Javascript using css-selector  locator
		js.executeScript("arguments[0].value='Hello1234'", password);
		
		
		
		//Select Dropdown option using javascript executor
		js.executeScript("document.getElementById('day').value='28'");
		js.executeScript("document.getElementById('month').value='10'");
		js.executeScript("document.getElementById('year').value='1990'");
		
		
		//Select Radio button 
		WebElement Female_Radio_btn=driver.findElement(By.xpath("//input[@value='1']"));
		js.executeScript("arguments[0].checked='true'",Female_Radio_btn);
		Thread.sleep(4000);
		

		//Select Radio button 
		WebElement male_Radio_btn=driver.findElement(By.xpath("//input[@value='2']"));
		js.executeScript("arguments[0].click()",male_Radio_btn);
		Thread.sleep(4000);
		
	}
}
