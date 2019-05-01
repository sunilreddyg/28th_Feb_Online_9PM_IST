package corejava.arrays;

public class Array_Double_DimenSion 
{

	public static void main(String[] args) 
	{
		
		
		/*
		 *  Note:--> Double dimension array store data in
		 *  		 tabler format.
		 */
		
		
		//Static Array
		String data[][]=new String[3][2];   //Row And Cell
		
		data[0][0]="user1";
		data[0][1]="pwd1";
		
		data[1][0]="user2";
		data[1][1]="pwd2";
		
		data[2][0]="user3";
		data[2][1]="pwd3";
		
		System.out.println("1st row zero cell value is => "+data[1][0]);
		
		
		
		//Runtime double dimension array
		String pair[][]=
			{
					{"Telangana","HYD"},
					{"Andhrapradesh","ATP"},
					{"Chennai","Madhurai"},
		    };
		
		
		System.out.println("1st row zero cell value is => "+pair[1][0]);
		

	}

}
