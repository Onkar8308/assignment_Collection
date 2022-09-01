package Collection_assignment.assignment2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import Collection_assignment.Data;
import Collection_assignment.ReadFile;



public class SortByPair {

	
	public void SortBypair() throws IOException {
	ReadFile cc = new ReadFile();
	ArrayList<Data> currencydata = cc.csvFilereader();
	
	Collections.sort(currencydata, (s1,s2) -> (s1.getCcy1()+s1.getCcy2()).compareTo(s2.getCcy1()+s2.getCcy2()));
	
	for(Data sortbypair : currencydata) {
		
		 //printing  the sorted values based on currency
		System.out.println(sortbypair);
		}

	}
	
	
		
}
