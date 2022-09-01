package Collection_assignment.assignment1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Collection_assignment.Data;
import Collection_assignment.ReadFile;


public class SearchByPair {
	public void searching() throws IOException {
		
		ReadFile read = new ReadFile();
		ArrayList<Data> values = read.csvFilereader();
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the ccy1 & ccy2 values");
		
		String currency = sc.next().toUpperCase();
		String flag="false";
		for (Data c1 : values) {
			if(currency.equals(c1.getCcy1()+c1.getCcy2())) {
				//printing the data
				flag="true";
				System.out.println(c1); 
			}
		}
		if(flag=="false")
			System.out.println("no record found");
		
		sc.close();

	}

}
