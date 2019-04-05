package verificationcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRuntime_Attribute_Value {

	public static void main(String[] args) throws Exception 
	{

		//browser initiation syntax
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://content.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		
		
		
		//Identify sensex tab
		WebElement Sensex_tab=driver.findElement(By.xpath("//a[contains(@id,'InvestRec')]"));
		Sensex_tab.click();
		
		
		//get runtime attribute to verify Sensex tab active output
		String Runtime_class=Sensex_tab.getAttribute("class");
		
		
		if(Runtime_class.equals("tab-active"))
			System.out.println("As expected sensex tab active");
		else
			System.out.println("Action failed sensex tab is not ative");
		
		
	}

}
