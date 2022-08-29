package assignment_4_C_C;

import java.util.Comparator;

public class ComapareByName implements Comparator<IceCreamParlor> {

		
	//class to compare IceCreamParlor by name
	
	@Override
	public int compare(IceCreamParlor o1, IceCreamParlor o2) {
		
		return o1.getName().compareTo(o2.getName());
	}
	

}
