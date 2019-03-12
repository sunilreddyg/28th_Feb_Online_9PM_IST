package diff_package_methods;

import regular_methods.Phone_Features;

public class Running_Methods_from_diff_package 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Note:--> To call any public methods from diff package
		 * 			we must import package referals to current class.
		 */
		
		Phone_Features obj=new Phone_Features();
		obj.touch();
		obj.wifi();
		

		
		
		
		
		
		
	}

}
