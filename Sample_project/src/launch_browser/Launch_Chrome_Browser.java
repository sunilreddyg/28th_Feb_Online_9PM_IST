package launch_browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Chrome_Browser 
{

	public static void main(String[] args) 
	{
		
		
		/*
		 * Download chrome driver.
		 * URL:=> https://www.seleniumhq.org/download/
		 * => Under third party drivers download required driver
		 * => click on google-chrome-driver link
		 * => download chromedriver w.r.t chrome browser version
		 * => at index page download chromedriver.zip format file for windows
		 * => unzip file to project folder 
		 *
		 * 	
		 */
		

		//launch chrome browser
		ChromeDriver chrome=new ChromeDriver();
		//load webpage to browser
		chrome.get("https://google.com");
		
		
		

	}

}
