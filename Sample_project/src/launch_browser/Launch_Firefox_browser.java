package launch_browser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Firefox_browser {

	public static void main(String[] args)
	{
		
		/*
		 * Downlaod Geckodriver
		 * URL:--> https://github.com/mozilla/geckodriver/releases
		 * => Download geckodriver w.r.t firefox version
		 * => Downlaod zip format file for windows [64 bit]
		 * 		geckodriver-v0.21.0-win64.zip  ==> 57+
		 * => Unzip file to project folder.
		 */
		 FirefoxDriver firefox=new FirefoxDriver();
		 firefox.get("http://seleniumhq.org");
	}

}
