package robot_actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Copy_String_Using_AWT 
{

	public static void main(String[] args) throws IOException, InterruptedException, AWTException 
	{
		//Launch notepad file at runtime
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		
		//Create object for Robot class
		Robot robot=new Robot();
		robot.setAutoDelay(500);   //time in milli-seconds
				
	
		String text="Selenium automates browsers. That's it! What you do with that power is entirely up to you";

		//Select String
		StringSelection Stext=new StringSelection(text);
		//Get runtime system clipbord
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//Set content to clipboard
		clipboard.setContents(Stext, Stext);
		
		
		//Paste copied text into notepad file using ctrl+V shrotcut
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Relase Control key
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		
	}

}
