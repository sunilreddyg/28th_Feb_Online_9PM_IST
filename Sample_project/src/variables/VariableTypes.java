package variables;

public class VariableTypes 
{
	String email="info@mindqsystems.com";   //Instant variable
	static String mobile="9030248855";      //Class variable
	
	
	public void method1()
	{
		String name="WD";  //Local variable [inside method]
		System.out.println("local variable name is => "+name);
	}
	
	
	
	public static void main(String args[])
	{
		
		/*
		 * Note:--> Instant variable to call from diff class or From main method.
		 * 			We must create object for class
		 */
		VariableTypes obj=new VariableTypes();
		String Inst_email=obj.email;
		System.out.println(Inst_email);
		
		/*
		 * Note:--> Class variable to all.
		 * 		Syntax:-->
		 * 				Classname.variablename;
		 */
		String Inst_mobile=VariableTypes.mobile;
		System.out.println(Inst_mobile);
	}

}
