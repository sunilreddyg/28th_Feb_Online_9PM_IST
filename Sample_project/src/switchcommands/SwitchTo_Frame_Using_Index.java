package switchcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame_Using_Index 
{

	public static void main(String[] args) 
	{
		
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
		driver.manage().window().maximize();
		
		//switch to frame using index number
		driver.switchTo().frame(0);
		
		
		//Identify link under frame
		driver.findElement(By.xpath("//a[@href='org/openqa/selenium/package-frame.html']")).click();


	}

}
