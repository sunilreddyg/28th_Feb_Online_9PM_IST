package capturescreen;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen_Capture {

	public static void main(String[] args) throws IOException
	{
	
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/");
		driver.manage().window().maximize();
		
		
		
		/*
		 * Note:--> In selenium higher versios to access local 
		 * 			utilities we need to configure below jar files to
		 * 		    selenium projects..
		 * 
		 * 	URL:-->  https://commons.apache.org/proper/commons-io/download_io.cgi
		 * 			 Download zip format file under binaries.
		 * 			 After download file unzip file and configure 
		 * 					all executable jar files to current project.
		 * 
		 */
		
		
		/*  Take screenshot at runtime and covert into file format, So tha
		 *  we can dump into local utilities
		 */
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screens\\image.png"));
		
		

	}

}
