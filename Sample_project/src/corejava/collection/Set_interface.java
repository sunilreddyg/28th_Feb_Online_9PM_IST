package corejava.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_interface {

	public static void main(String[] args)
	{
		
		
		/*
		 * set:--> Set is a unorder collection of objects. Set doesn't
		 * 			allow duplicate values to store...
		 */
		
		Set<String> set=new HashSet<String>();
		set.add("IDE");  //Add object to set interface
		set.add("RC");
		set.add("WD");
		set.add("GRID");
		set.add("APPIUM");
		set.add("Cucumber");
		set.add("Jenkins");
		set.add("WD");
		
		
		//Get size of set of objects
		int count=set.size();
		System.out.println("Object count at set interface => "+count);
		
		//remove object from set interface
		set.remove("GRID");
		
		//Verify object available at set interface
		boolean flag=set.contains("GRID");
		System.out.println("object available status is => "+flag);
		
		
		//Print all object in set interface using foreach loop
		for (String Eachtool : set) 
		{
			System.out.println("=> "+Eachtool);
		}
		
	}

}
