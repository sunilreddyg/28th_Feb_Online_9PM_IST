package verificationcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_Get_location {

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
		
		
		
		//Get Element point
		Point Obj_Point=Sensex_tab.getLocation();
		//Using object point get element x and y coordinates
		int Obj_x=Obj_Point.getX();
		int Obj_y=Obj_Point.getY();
		
		System.out.println("Object x coordinates are => "+Obj_x);
		System.out.println("Object y coordinates are => "+Obj_y);
		
		
		
		//Verify Element visibility using x and y coordinates
		if(Obj_x > 0)
		{
			System.out.println("Element visible ");
		}
		else
		{
			System.out.println("Element hidden at webpage");
		}
		
		
		
		
		


	}

}
