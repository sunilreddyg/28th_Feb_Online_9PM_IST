package capturescreen;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenCapture_With_timeStamp 
{

	public static void main(String[] args) throws Exception 
	{
		
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		
		//Java time stamp
		
		//get default system date
		Date d=new Date();
		//Create simple date format
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MMM/dd/ hh-mm-ss");
		//using dateformatter convert system default date
		String time=sdf.format(d);
		
		
		//Capture screen at required location
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screens\\"+time+"image.png"));
		
				
						
		

	}

}
