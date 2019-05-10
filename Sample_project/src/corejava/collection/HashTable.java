package corejava.collection;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class HashTable {

	public static void main(String[] args) 
	{
		
		/*
		 *  Hash accept objects to store using key and value, Hashset
		 *  allow pair values to store.
		 *  	
		 *  Note:-- hashtable is sorted set of objects.It will like similar
		 *  		to set interface
		 */
		
		
		Hashtable<Integer, String> hash = new Hashtable<Integer,String>();
		hash.put(1,"IDE"); 
		hash.put(2,"RC");
		hash.put(3,"WD");
		hash.put(4,"GRID");
		
		
		//using keyname get keyvalue
		String val=hash.get(3);
		System.out.println("Value is => "+val);
		
		
		//Get All keys
		Set<Integer> keys=hash.keySet();
		//Iterate for number of keys using foreach loop
		for (Integer key : keys) 
		{
			System.out.println("=> "+hash.get(key));
		}
		
		
		
		
		
        
        
        
		

	}

}
