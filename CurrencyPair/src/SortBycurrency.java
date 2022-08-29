import java.io.IOException;
import java.util.ArrayList;


public class SortBycurrency {
	public static void main(String[] args) throws IOException {
		SearchByPair cc = new SearchByPair();
		ArrayList<CSV> currencydata = cc.csvFilereader();
		CSV currency = new CSV();  
		
		currency.Sortbycurrency(currencydata);  
		for(CSV c1 : currencydata) {
			
			 //printing  the sorted values based on currency
			System.out.println(c1);
		}

	}

}
