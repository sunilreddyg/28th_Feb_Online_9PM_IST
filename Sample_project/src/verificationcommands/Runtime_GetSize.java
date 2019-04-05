package verificationcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_GetSize {

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
		
		
		//Get runtime element height and width
		Dimension Obj_dim=Sensex_tab.getSize();
		//Using object dimension get element height and size
		int Obj_height=Obj_dim.getHeight();
		int Obj_width=Obj_dim.getWidth();
		
		System.out.println("Obj height is => "+Obj_height);
		System.out.println("Obj widht is ==> "+Obj_width);
		
		
		

	}

}
