package findelemetns;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_links 
{

	public static void main(String[] args) throws Exception 
	{
		
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		
		
		//Identify location of paytm main links..
		WebElement App_navigations;
		App_navigations=driver.findElement(By.cssSelector("div[data-reactid='233']"));
		
		//Find list of achor tag elements under App navigations
		List<WebElement> All_links;
		All_links=App_navigations.findElements(By.tagName("a"));
		
		
		
		System.out.println(All_links.size());
		
		//Iterate for number of links
		for (int i = 0; i < All_links.size(); i++) 
		{
			
			//Target Each dynamic link with index number
			WebElement Eachlink=All_links.get(i);
			//get link name and linkhref
			String linkname=Eachlink.getText();
			String linkhref=Eachlink.getAttribute("href");
			
			System.out.println(linkname+"   "+linkhref);
			
			
			//Click Eachlink
			Eachlink.click();
			Thread.sleep(3000);
			
			//navigate to back page
			driver.navigate().back();
			Thread.sleep(3000);
			
			
			//Restore all variable referrals
			App_navigations=driver.findElement(By.cssSelector("div[data-reactid='233']"));
			All_links=App_navigations.findElements(By.tagName("a"));
		}

	}

}
