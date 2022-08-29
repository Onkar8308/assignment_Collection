package Finzly_assignmets;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
	
		public ArrayList<Csv> csvFilereader() throws IOException {
			String path = "C:\\Users\\katewal\\Downloads\\csv";
			String l ;
			String[] line;
			ArrayList<Csv> currencydata = new ArrayList<>();
			BufferedReader reader = new BufferedReader(new FileReader(path));  //used to read csv file
			reader.readLine();
			while ((l = reader.readLine())!=null) {
				line = l.split(",");
				Csv data = new Csv(line[0],line[1],line[2],line[3],line[4],line[5]); //rows in csv file will be stored in the list
				currencydata.add(data);
			}
			return currencydata;
		}

		public static void main(String[] args) throws IOException {
			//this will search the Csv and retrieve the data based on that
			CsvFileReader cc = new CsvFileReader();
			ArrayList<Csv> values = cc.csvFilereader();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Csvs to retrive the data:");
			String currency = sc.next();
			String match = "false";    //variable to make sure whether the file contains the currency pair
			for (Csv ok : values) {
				if(currency.equals(ok.getCcy1()+ok.getCcy2())) {
					match = "true";
					System.out.println(ok); //displays the required currency pair values
				}
			}
			if(match.equals("false")) {
				System.out.println("Please provide the correct value");
			}
	}
}
                                                              