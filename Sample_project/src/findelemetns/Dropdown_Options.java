package findelemetns;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Dropdown_Options 
{

	public static void main(String[] args) throws Exception 
	{
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		
		//Identify state dropdown
		WebElement State_Dropdown=driver.findElement(By.id("customState"));
		
		
		//Find list of option tags under stateDropdown
		List<WebElement> Doptions=State_Dropdown.findElements(By.tagName("option"));

		//Get size of dropdown options
		int Count=Doptions.size();
		
		//Apply for loop to iterate expected option count times
		for (int i = 1; i < 6; i++)
		{
			//Get every option tag using dynamic row number
			WebElement EachOption=Doptions.get(i);
			
			//GetName of Each dropdown option
			String Option_name=EachOption.getText();
			//System.out.println("=> "+Option_name);

			//Click Each Dropdown option
			EachOption.click();
			Thread.sleep(3000);
			
			
			//Identify city dropdown
			WebElement City_dropdown=driver.findElement(By.id("customCity"));
			//Capture All Cities from dropdown
			String All_Cities=City_dropdown.getText();
			
			//maintained city names w.r.t state selection
			String Exp_cities[]={"null","South Andaman","Anantapur","Tawang","Darrang","Banka"};
			
			
			//Verify respective cities displayed on state selection
			if(All_Cities.contains(Exp_cities[i]))
			{
				System.out.println(Option_name+"==> Expected city available");
			}
			else
			{
				System.out.println(Option_name+" ==> expected city not available");
			}
			
			
		}
		
		
		
		
	}

}
