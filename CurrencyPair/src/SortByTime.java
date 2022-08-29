import java.io.IOException;
import java.util.ArrayList;

public class SortByTime {
	
	public static void main(String[] args) throws IOException { 
		SearchByPair cc = new SearchByPair();
		ArrayList<CSV> currencydata= cc.csvFilereader(); 
		CSV c = new CSV();   
		c.sortbytime(currencydata);  
		//using comparator to sort the data based on lastUpdated time
		for(CSV sort: currencydata) {
			
			 //printing  the sorted values based on lastUpdatedTime
			System.out.println(sort);      
		}
	}
}
