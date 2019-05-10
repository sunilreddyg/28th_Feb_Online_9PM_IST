package corejava.Loops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class While_Loop {

	public static void main(String[] args) throws Exception 
	{
		
		
		/*
		 * While:-->
		 * 			=> Is a condition based loop and it start
		 * 				iteration when condition return true then
		 * 				it follow iteration until condition return false.
		 */
		
		
		int i=100;
		while(i < 20)
		{
			System.out.println(i);
			i=i+1;
		}
		
		
		
		
		/*
		 * Example:--> Using while loop implement explicit wait
		 * 				until element visible at webpage.
		 */
		
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		//Identify location at webpage
		WebElement Retype_email=driver.findElement(By.id("u_0_r"));
		
		int j=0;
		while(!Retype_email.isDisplayed())
		{
			j=j+1;
			Thread.sleep(1000);
			if(j==20)
			{
				break;
			}
		}
		
		
		
		//Condition
		if(j==20)
		{
			throw new Exception("Timeout completed expected element not visible");
		}
		
		
		System.out.println("Element visible at webpage");
		
		

	}

}
