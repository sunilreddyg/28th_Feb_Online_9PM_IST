package verificationcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_CssValue {

	public static void main(String[] args) 
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
		
		
		/*
		 * Note:--> Getcssvalue return color and bg-color in 
		 * 		RGBA format  [Red, Green ,Blue, Alpha]
		 */
		
		
		//Get runtime back-ground color of location
		String Runtime_bg_color=Sensex_tab.getCssValue("background-color");

		String Exp_bg_color="rgba(231, 120, 23, 1)";
		
		
		//Verif Expected and acutal bg-color
		if(Runtime_bg_color.equals(Exp_bg_color))
			System.out.println("background color match sensex tab is selected");
		else
			System.out.println("background color is mismatch sensex tabis not selected");
		
		
		
		
		

	}

}
