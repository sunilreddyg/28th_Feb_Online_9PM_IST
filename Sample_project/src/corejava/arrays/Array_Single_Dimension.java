package corejava.arrays;

public class Array_Single_Dimension 
{

	public static void main(String[] args)
	{
		
		/*
		 * Array:--> Array is a collection of similar events and
		 * 			we can store set of events into single variable.
		 * 
		 * 			1.Static Array
		 * 			2.Dynamic Array
		 */
		
		
		/*
		 * Static Array:-->
		 * 			=> We must specify boundary levels before store values.
		 */
		String browsers[]=new String[4];
		browsers[0]="firefox";
		browsers[1]="chrome";
		browsers[2]="ie";
		browsers[3]="safari";
		
		System.out.println("browser name at index 2 is => "+browsers[2]);
		
		
		
		/*
		 * Runtime Array:-->
		 * 		Need not to specify boundary levels, Array it self
		 * 		arrange index values based data available.
		 */
		
		String tools[]={"IDE","RC","WD","GRID"};
		System.out.println("second index value is => "+tools[2]);
		
		
		

	}

}
