package verificationcommands;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Inputvalue_From_editbox {

	public static void main(String[] args) 
	{
		
		/*
		 * Testcase:-->
		 * 		Verify departure date matches with current system date
		 */
		
		//browser initiation syntax
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		
		//Identify departue date editbox
		WebElement Departue_Date=driver.findElement(By.xpath("//input[contains(@id,'ctl00_mainContent_view_date1')]"));
		//Capture input from departure date editbox
		String Ddate=Departue_Date.getAttribute("value");
		System.out.println(Ddate);
		
		
		
		//Get system default date at runtime..
		Date d=new Date();   //java.util
		//Create simple date-format
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM");
		//Using simple date formatter convert default system date
		String Sdate=sdf.format(d);
		
		
		//Verify System date and departure date equal comparision
		if(Sdate.equals(Ddate))
			System.out.println("format match found");
		else
			System.out.println("format mismatch");

	}

}
