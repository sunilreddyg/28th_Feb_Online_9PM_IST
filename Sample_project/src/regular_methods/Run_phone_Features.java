package regular_methods;

public class Run_phone_Features 
{

	public static void main(String[] args) 
	{
		
		//Create object to call phone_feature class methods
		new Phone_Features().touch();
		new Phone_Features().wifi();
		
		
		
		/*
		 * Create object for class
		 * 	Syntax:-->
		 * 		Classname obj=new Classname();
		 * 		obj.methodname();
		 */
		
		Phone_Features obj=new Phone_Features();
		obj.touch();
		obj.wifi();
		
		
		
		
		
		
		
		
	}

}
