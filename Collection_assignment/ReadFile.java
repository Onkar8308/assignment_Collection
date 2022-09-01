package Collection_assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class ReadFile {
	
	public ArrayList<Data> csvFilereader() throws IOException {
		String path = "C:\\Users\\katewal\\eclipse-workspace\\Finzly_assignments\\src\\Collection_assignment\\CurrencyPairs.csv";
		String l ;
		String[] line;
		ArrayList<Data> Currencydata = new ArrayList<>();
		
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			br.readLine();
			if(br.readLine()==null)
				System.out.println("Your File is empty");
			
			while ((l= br.readLine())!=null) {
				line=l.split(",");
				
				
				//obtain the date and time from the String using parse function
				Data data = new Data(line[0], line[1], line[2], line[3], line[4],LocalDateTime.parse(line[5]) );				
				// adding the object to the list
				Currencydata.add(data);
			}
		}
		catch (IOException e){
			e.printStackTrace();
			
		}
		
		return Currencydata;
	}	
	
}
