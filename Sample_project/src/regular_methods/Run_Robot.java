package regular_methods;

public class Run_Robot 
{

	public static void main(String[] args)
	{
		
		/*
		 * Note:--> Any class methods and variables to
		 * call we must created object for class
		 * 
		 *   Rule1=>    new keyword access any public class constructor
		 *   Rule2=>    on constructor . [Dot]  operator access method and variable inside class
		 * 
		 */
		
		
		//call or run methods from Robot class
		
		new Robot().Run();
		new Robot().Jump();

	}

}
