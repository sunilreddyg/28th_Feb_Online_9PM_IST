package conditional_Statements;

public class Decision_Statements 
{

	public static void main(String[] args)
	{
		
		
		/*
		 * In java programming decision statemenets
		 * mainly categorized into 4 types
		 * 
		 * 		IF
		 * 		IF-ELSe
		 * 		ELSE -IF
		 * 		Switch-Case
		 */
		
		
		
		/*
		 * IF:-->
		 * 		If conditon execute selected block of code
		 * 		with independent decision.
		 * 	
		 * 		Note:--> If accepts only boolean comparision value
		 */
		
		String day="sunday";
		
		if(day.equals("sunday"))
		{
			System.out.println("Sunday is holiday");
		}
		
		
		
		
		/*
		 * IF-ELSE:-->
		 * 		Any two decisions we can execute
		 */
		int Age=20;
		if(Age > 18)
		{
			System.out.println("Age match");
		}
		else
		{
			System.out.println("Age mismatch");
		}
		
		
		
		/*
		 * ELSE-IF:-->
		 * 		Multiple decision statement...
		 */
		String week="sun";
		if(week.equals("sun"))
		{
			System.out.println("50% offer");
		}
		else if(week.equals("mon"))
		{
			System.out.println("40% offer");
		}
		else if(week.equals("tue"))
		{
			System.out.println("30% offer");
		}
		else if(week.equals("wed"))
		{
			System.out.println("30% offer");
		}
		else
		{
			System.out.println("No offer applied");
		}
		
		
		
		
		/*
		 * Switch-case:-->
		 * 		Execute multiple decisions same as else-if
		 * 		condition. But only diff switch only execute
		 * 		required case instead of verify each decision.
		 */
		
		String browsername="ie";
		switch (browsername) 
		{
		case "chrome":
			System.out.println("chrome browser launched");
			break;
			
		case "firefox":
			System.out.println("firefox browser launched");
			break;
			
			
		case "ie":
			System.out.println("ie browser launched");
			break;

		default:System.out.println("browser name mismatch");
			break;
		}
		

	}

}
