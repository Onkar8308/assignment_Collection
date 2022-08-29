package assignment_4_C_C;
import java.util.ArrayList;
import java.util.Collections;

class Main {
public static void main(String[] args) {
		
		//adding the item in the list
		ArrayList<IceCreamParlor> item=new ArrayList<>();
		item.add(new IceCreamParlor("corneto", 70, 7.5));
		item.add(new IceCreamParlor("vanilla", 80, 8.5));
		item.add(new IceCreamParlor("Chocklate", 50, 9.5));
		item.add(new IceCreamParlor("Mint chocklate chip", 110, 8));
		
		System.out.println("sorting the list according to the price of iceCream");
		Collections.sort(item);
		
		//.out.println("iceCream flavor after sorting");
		for(IceCreamParlor icp : item) {
			System.out.println(icp.getName() + " " +
								icp.getRating() + " " +
								icp.getPrice());
		}
		
		System.out.println("sorting the list according to the Name of IceCream");
		ComapareByName cbn=new ComapareByName();
		Collections.sort(item,cbn);
		for(IceCreamParlor icp:item) {
			System.out.println(icp.getName() + " " +
								icp.getPrice() + " " + 
									icp.getRating() + " ");
		}
		
		System.out.println("sorting list according to the rating of iceCream");
		CompareByRating cbr=new CompareByRating();
		Collections.sort(item,cbr);
		for(IceCreamParlor icp:item) {
			System.out.println(icp.getName() + " " +
					icp.getPrice() + " " + 
						icp.getRating() + " ");	
		}
	}
	

}
