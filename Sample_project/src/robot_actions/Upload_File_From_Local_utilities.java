package robot_actions;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_File_From_Local_utilities {

	public static void main(String[] args) throws Exception
	{
		
		///browser initiation
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://my.naukri.com/account/register/basicdetails");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@value='exp']")).click();
		Thread.sleep(3000);
		
		WebElement Upload_resume=driver.findElement(By.xpath("/html/body/main/div/div/form/resman-uploader/div/div[1]/span[1]/input"));
		Upload_resume.click();
		Thread.sleep(5000);
		
		String text="C:\\Users\\sunny\\Downloads\\SunilReddy.doc";

		//Copy String
		StringSelection stext=new StringSelection(text);
		//Get system clipboard at rutime
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//Set content to clipboard
		clipboard.setContents(stext, stext);
		
		
		//Create object for robot class
		Robot robot=new Robot();
		
		
		//Use ctrl+V shortcut to paste.
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Release control key
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		
		//Pree enter key to submit path
		robot.keyPress(KeyEvent.VK_ENTER);
	}

}
