package Collection_assignment.assignment3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import Collection_assignment.Data;
import Collection_assignment.ReadFile;

public class SortByLastUpdatedTime {
	public void sortbytime() throws IOException {
	ReadFile cc = new ReadFile();
	ArrayList<Data> currencydata= cc.csvFilereader();
	
	Collections.sort(currencydata,(d1,d2) -> (d1.LastUpdatedTime.compareTo(d2.LastUpdatedTime)));
	
	for(Data sortbytime: currencydata) {
		
		 //printing  the sorted values bSased on lastUpdatedTime
		System.out.println(sortbytime);      
	}
	}

}
