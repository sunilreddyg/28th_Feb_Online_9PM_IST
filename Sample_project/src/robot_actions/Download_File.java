package robot_actions;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Download_File {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.seleniumhq.org/download/");
		driver.manage().window().maximize();
		
		//Identify Element
		WebElement download=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/p[3]/a"));
		download.click();
		Thread.sleep(3000);
		
		//Create object for Robot framework
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		//Press shift+tab to bring controls from cacel to save button
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_TAB);
		
		//Release shift key
		robot.keyRelease(KeyEvent.VK_SHIFT);
		
		Thread.sleep(4000);
		
		
		//press enter to confirm download
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
		

	}

}
