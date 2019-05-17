package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class FB_Signin 
{
	
	
	@FindBy(how=How.ID,using="email") 
	WebElement Email_editbox;
	
	
	@FindBy(name="pass")
	WebElement Password_editbox;
	
	
	@FindBy(xpath = "//label[@id='loginbutton']")
	WebElement Signin_btn;
	
	@FindBy(xpath = "//a[contains(.,'Forgotten account?')]")
	WebElement Forgott_Account_link;
	
	
	
	
	
	
	
}
