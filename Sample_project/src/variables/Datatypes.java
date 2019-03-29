package variables;

public class Datatypes {

	public static void main(String[] args)
	{
		
		
		/*
		 * byte:--> 
		 * 		=> Numeric datatype [Only accept numbers]
		 * 		=> default value is 0
		 * 		=> max value is 127
		 * 		=> min value is -128
		 */
		
		byte a=127;
		System.out.println("byte value is => "+a);
		
		
		/*
		 * short:--> 
		 * 		=> Numeric datatype [only accept numbers]
		 * 		=> Default value is zero
		 */
		short b=26000;
		System.out.println("shrot value is => "+b);
		
		
		/*
		 * int :-->
		 * 		=> Numaric datatype [only accept numbers]
		 * 		=> Default value is 0
		 * 	Note:--> Whenever numbers to store alwasy use int.
		 */
		int c=2100000000;
		System.out.println("int value is => "+c);
		
		
		/*
		 * boolean:-->
		 * 		=> Default value is false
		 * 		=> boolean accept only true/false.
		 */
		boolean flag=true;
		System.out.println("boolean value is => "+flag);
		
		
		/*
		 * char:-->
		 * 		=> Single character to store.
		 */
		char group='A';
		System.out.println("char value is => "+group);
		
		
		/*
		 * double:-->
		 * 			Any decimal values to store.
		 * 			15 significant decimal it allows
		 */
		double version=3.14877;
		System.out.println("double value is => "+version);
		
		/*
		 * float:--> any decimal value
		 * 			8 signinficant decimals it allow.
		 */
		float value=20.123f;
		System.out.println("float value is => "+value);
		
		
		
		/*
		 * Non-primitive datatype:-->
		 * 	String:-->
		 * 			=> String allow set of characters to store
		 * 			=> Default value of string is null.
		 */
		String name="MQ";
		String mobile="9030248855";
		String email="info@mindqsystems.com";
		String address="#310, Srnagar,";
		
		System.out.println(name+"   "+mobile+"    "+email);
	}

}
