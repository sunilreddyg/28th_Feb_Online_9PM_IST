package verificationcommands;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Runtime_URl {

	public static void main(String[] args) 
	{
		
		/*
		 * Automation Testcase:-->
		 * 		Verify NR Forex Rates link at HDFC bank NRI page
		 * 	Steps:-->
		 * 		Launch browser window
		 * 		load hdfc bank url
		 * 		maximize window  [optional]
		 * 		click NRI link at homepage
		 * 		click NR forex link at NRI page.
		 * 		
		 * 	Expected:-->
		 * 		System should display Forex page with Details		
		 */
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("window maximized and ready to use");
		
		
		//click NRI link at hdfc homepage
		WebElement NRI_link=driver.findElement(By.linkText("NRI"));
		NRI_link.click();
		
		//click NR forex rates link at NRI page
		WebElement NR_forex_rates_link=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[1]/div[3]/div[2]/div[2]/div/div[2]/div[1]/div/ul/li[3]/a"));
		NR_forex_rates_link.click();
		
		
		String exp_url="/nri_banking/Foreign_Exchng_Rates/Foreign_Exchng_Rates.asp";
		
		//Verify expected url presented at current window
		
		//Get Currnet window at runtime
		String Runtime_url=driver.getCurrentUrl();
		
		
		//Verify parital url available at runtime url
		if(Runtime_url.contains(exp_url))
		{
			System.out.println("As Expected required url presented for roreign exchange rates link");
		}
		else
		{
			System.out.println("Expected failed wrong url presented for foreign exchange rates link");
		}
	
	}

}
