package webdriver_Scripting.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Verify_Dropdown_multiple_Selection 
{

	public static void main(String[] args) throws Exception
	{
		
		
		//browser initiation syntax
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://content.icicidirect.com/idirectcontent/Home/Home.aspx");
		driver.manage().window().maximize();
		
		
		//Write a program to verify dropdown allow multiple selection
		
		
		boolean flag=new Select(driver.findElement(By.id("open_account"))).isMultiple();
		System.out.println("Dropdown multiple selection state is => "+flag);
		
		
		
		/*
		 * Using javascript convert single option dropdown into Multiple
		 * option dropdown.
		 */
		((JavascriptExecutor)driver).executeScript("document.getElementById('open_account')"
				+ ".setAttribute('multiple','multiple')");
		Thread.sleep(5000);
		
		
		
		
		boolean flag1=new Select(driver.findElement(By.id("open_account"))).isMultiple();
		System.out.println("Dropdown multiple selection state is => "+flag1);
		
		
		
		//select Options at single dropdown
		Select Open_account=new Select(driver.findElement(By.id("open_account")));
		Open_account.selectByIndex(2);
		Open_account.selectByIndex(4);
		Open_account.selectByIndex(6);
		Thread.sleep(4000);
		
		
		Open_account.deselectByIndex(0);
		Open_account.deselectByIndex(4);
		
		
		
	}

}
