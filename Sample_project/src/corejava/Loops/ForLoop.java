package corejava.Loops;

public class ForLoop 
{

	public static void main(String[] args) 
	{
		
		/*
		 * For:--> is prefarable any perticular range of iterations
		 * 			to execute.
		 */
		
		
		
		/*
		 * Example:--> Print numbers from 1 to 10
		 */
		for (int i = 1; i <=10 ; i++) 
		{
			System.out.println(i);
		}
		
		
		
		//Store data into array
		String tools[]={"IDE","RC","WD","GRID"};
		int count=tools.length;
		
		//Print all toolnames using forloop
		for (int i = 0; i < tools.length; i++) 
		{
			System.out.println(tools[i]);
		}
		
		
		
		
		
		
		
		
		
		

	}

}
