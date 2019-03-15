package webdriver_Scripting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext_Partial_LInkText {

	public static void main(String[] args) 
	{
		
		//browser initiation syntax
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://cleartrip.com");
		driver.manage().window().maximize();
		
		
		
		/*
		 * Htmlsource:--> 
		 * 
		 * 		<a href="/about" title="About Us" >About Us</a>
		 * 
		 * 		Using linkname identifying link.
		 */
		driver.findElement(By.linkText("About Us")).click();
		
	
		/*
		 * HtmlSource:-->
		 * 		<a href="/jobs">Jobs</a>
		 */
		driver.findElement(By.linkText("Jobs")).click();
		
		
		/*
		 * Htmlsource:-->
		 * 	<a href="/jobs/openings">Job Openings</a>
		 */
		driver.findElement(By.linkText("Job Openings")).click();
		
		
		/*
		 * HtmlSource:--->
		 * 
		 *		<a href="https://www.cleartrip.com/jobs/openings/senior-executive-agency-sales/">
		 *			<strong>Senior Executive-Agency Sales</strong>
		 *			<span class="location">Chennai</span>
		 *		</a>
		 *		        
		 */
		driver.findElement(By.partialLinkText("Senior Executive-Agency Sales")).click();
		
		
	}

}



