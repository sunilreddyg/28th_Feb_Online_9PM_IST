package validationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_ContentDisplay_At_TreeView 
{

	public static void main(String[] args) throws Exception 
	{
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Home/CorporateService.aspx");
		driver.manage().window().maximize();
		
		
		/*
		 * When user click resources link it will bring sub categories
		 * visible to front page.
		 */
		
		WebElement Resources=driver.findElement(By.xpath("//a[contains(.,'Resources')]"));
		Resources.click();
		Thread.sleep(5000);
		
		//Verify monet manager sub category displayed under resource link.
		WebElement Money_Manager=driver.findElement(By.xpath("//a[@title='Money manager']"));
		
		if(Money_Manager.isDisplayed())
			System.out.println("Tree view expanded and money manager text visible at webpage");
		else
			System.out.println("Failed to expand tree view and expected text not visible at webpage");
		
		
		/*
		 * When use click resource link when sub categories are opened.
		 */
		Resources.click();
		Thread.sleep(5000);
		
		if(!Money_Manager.isDisplayed())
			System.out.println("Test pass tree view closed");
		else
			System.out.println("Testfail tree view visible to end user.");
		

	}

}
