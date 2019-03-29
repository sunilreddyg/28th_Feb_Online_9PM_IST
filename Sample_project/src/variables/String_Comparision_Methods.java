package variables;

public class String_Comparision_Methods {

	public static void main(String[] args)
	{
		
		/*
		 * String:-->
		 * 		=> String is a non-primitive datatype and it store
		 * 			set of characters.
		 * 	
		 * 		=> String is not only a dataype and also called as Class.
		 * 		   Because string contains set of events to validate
		 * 		   stored characters..
		 */
		
		 String exp_result="Account Created";
		 String act_result="Account created";
		 
		 /*
		  * Equals:-->
		  * 	Method verify any two strings equal comparision 
		  * 	and return boolean value true/false.
		  * 
		  * 	[Equal verify string with case-sensitive]
		  */
		 boolean flag=exp_result.equals(act_result);
		 System.out.println("Equal comparision is => "+flag);
		 
		 
		 /*
		  * EqualIgnorecase:-->
		  * 	Method verify any two strings equal comparision
		  * 	and return boolean value true/false.
		  * 
		  * 	[Equalignorecase verify without case-sensitive]
		  */
		 boolean flag1=exp_result.equalsIgnoreCase(act_result);
		 System.out.println("Equalingore case comparision is => "+flag1);
		 
		
		 /*
		  * Contains:-->
		  * 	method verify sub String available at main String
		  * 	and return boolean value true/false.
		  */
		 String status="Account create 100 successfull";
		 boolean flag2=status.contains("100");
		 System.out.println("sub string available status is => "+flag2);
		 
		 /*
		  * subString:-->
		  * 	Mehtod get sub String form main String.
		  */
		 String AccountNum="0000123456789783";
		 String sub=AccountNum.substring(12);
		 System.out.println("sub string characters are => "+sub);
		 
		 String sub1=AccountNum.substring(6,10);
		 System.out.println("middle characters are => "+sub1);
		 
		 
		 /*
		  * length:-->
		  * 		Method return characters length in integer
		  * 		format.
		  */
		 String mobile="9030248855";
		 int len=mobile.length();
		 System.out.println("mobile number length is => "+len);
		 
		 
		 
		 /*
		  * trim:-->
		  * 		Method trip extrs spaces with in string.
		  */
		 String pincode="   500016   ";
		 System.out.println("before trim length is => "+pincode.length());
		 //trim extra spaces
		 String new_pincode=pincode.trim();
		 System.out.println("after trim length is => "+new_pincode.length());
		 
		 
		 /*
		  * Startswith:-->
		  * 		Method verify given characters starts with
		  * 		expected chracters sequnces and return boolean
		  * 		value true/false.
		  */
		 String IFSC_Code="HDFC0001234";
		 boolean flag3=IFSC_Code.startsWith("HDFC");
		 System.out.println("Status IFSC code start with HDFC => "+flag3);
		 
		 
		 
		 /*
		  * isEmpty:-->
		  * 		Method verify empty status and return true/false
		  */
		 String var="";
		 String var1="Hello";
		 
		 System.out.println("var empty statu is => "+var.isEmpty());
		 System.out.println("var1 empty statu is => "+var1.isEmpty());
		 
		 
		 
		 /*
		  * Tolowercase:-->
		  * 		Methdod convert uppercase characters to lowercase
		  */
		 String Toolname="WEBDRIVE";
		 System.out.println("Lowercase characters => "+Toolname.toLowerCase());
		 
		 
		 /*
		  * Touppercase:-->
		  * 		Method convert lowercase characters to Uppercase
		  */
		 String email="info.dsnr@gmail.com";
		 System.out.println("Uppercase characters => "+email.toUpperCase());
	}

}
