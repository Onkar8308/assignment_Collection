import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class SearchByPair {

	
	public ArrayList<CSV> csvFilereader() throws IOException {
		String path = "C:\\Users\\katewal\\Downloads\\csv\\CurrencyPairs.csv";
		String l ;
		String[] line;
		ArrayList<CSV> Currencydata = new ArrayList<>();
		BufferedReader read = new BufferedReader(new FileReader(path));  //used to read the CSV file
		read.readLine();
		while ((l = read.readLine())!=null) {
			line = l.split(",");
			
			CSV data = new CSV(line[0],line[1],line[2],line[3],line[4],line[5]); //to store in list
			Currencydata.add(data);
		}
		return Currencydata;
	}

	public static void main(String[] args) throws IOException {

		SearchByPair read = new SearchByPair();
		ArrayList<CSV> values = read.csvFilereader();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Currencypairs to get the data:");
		String currency = sc.next();

		for (CSV c1 : values) {
			if(currency.equals(c1.getCcy1()+c1.getCcy2())) {
				//printing the data
				System.out.println(c1); 
			}
		}
		
	
	}
	}