package robot_actions;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Download_File_using_Mouse_Interactions 
{

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
		
	
		
		//Create object for robot
		Robot robot=new Robot();
		robot.setAutoDelay(1000);
		
		//Perfrom mouse move action using x and y coorindates
		robot.mouseMove(589, 433);
		//Press left click action.
		robot.mousePress(InputEvent.BUTTON1_MASK);
		Thread.sleep(5000);
		
		//Press enter enter key
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
		
		

	}

}
