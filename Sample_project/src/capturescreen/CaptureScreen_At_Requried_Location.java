package capturescreen;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CaptureScreen_At_Requried_Location 
{

	public static void main(String[] args) throws Exception 
	{
		
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		
		WebElement Aboutus_link=driver.findElement(By.xpath("//a[@title='About Us']"));
		//Perform movetoelemnet on about us link
		new Actions(driver).moveToElement(Aboutus_link).perform();
		Thread.sleep(3000);
		
		//Capture screen at required location
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screens\\footer_links.png"));
		
		
		
		
	}

}
