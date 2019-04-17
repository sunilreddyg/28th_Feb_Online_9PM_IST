package robot_actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Close_Browser_info_window 
{

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		  
		
		//Create object for robot
		Robot robot=new Robot();
		robot.setAutoDelay(1000);
		
		//Perfrom mouse move action using x and y coorindates
		robot.mouseMove(306, 167);
		//Press left click action.
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(5000);
		
		//Press enter enter key
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
		

	}

}
