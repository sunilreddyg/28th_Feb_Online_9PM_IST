package capturescreen;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScree_When_Alert_Presented 
{

	public static void main(String[] args) throws Exception 
	{
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/");
		driver.manage().window().maximize();
		
		
		WebElement Search_btn=driver.findElement(By.xpath("//input[@value='Search']"));
		Search_btn.click();
		Thread.sleep(5000);  //timeout to wait for alert
		
	
		//Create object for Robot
		Robot robot=new Robot();
		
		//Get default screen dimension
		Dimension screen_Size=Toolkit.getDefaultToolkit().getScreenSize();
		//Capture screen using robot
		BufferedImage image=robot.createScreenCapture(new Rectangle(screen_Size));
		//Create file location
		File path=new File("screens\\robotimage.png");
		//write image into local utilites
		ImageIO.write(image, "png", path);
		
		
		/*
		 * Note:--> selenium can't take screenshot when alert was presented
		 */

	}

}
