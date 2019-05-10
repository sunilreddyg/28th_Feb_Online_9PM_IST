package corejava.collection;

import java.util.ArrayList;
import java.util.List;

public class List_Interface {

	public static void main(String[] args) 
	{
		
		/*
		 * List:--> List accept multple objects to store with in order.
		 * 			List accept duplicate values to store..
		 */
		
		
		List<String> list=new ArrayList<String>();
		list.add("IDE");  //Add object to set interface
		list.add("RC");
		list.add("WD");
		list.add("GRID");
		list.add("APPIUM");
		list.add("Cucumber");
		list.add("Jenkins");
		list.add("WD");
		
		
		//Get size of list of objects
		int count=list.size();
		System.out.println("Object count at set interface => "+count);
		
		//remove object from list interface
		list.remove("GRID");
		
		//Verify object available at list interface
		boolean flag=list.contains("Jenkins");
		System.out.println("object available status is => "+flag);
		
		
		/*
		 * Note:--> Because list allow set of objects in order. Using
		 * 			get method under list interface we can get any
		 * 			required object using index number..
		 */
		
		String toolname=list.get(4);
		System.out.println("Index 4 tool name available => "+toolname);
		
		
		//Print all object using for loop
		for (int i = 0; i < list.size(); i++) 
		{
			String eachtool=list.get(i);
			System.out.println("=> "+eachtool);
		}
		
	}

}
