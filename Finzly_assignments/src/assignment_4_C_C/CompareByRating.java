package assignment_4_C_C;


import java.util.Comparator;

public class CompareByRating implements Comparator<assignment_4_C_C.IceCreamParlor>{

	@Override
	public int compare(IceCreamParlor o1, IceCreamParlor o2) {
		if(o1.getRating()>o2.getRating())
			return 1;
		if(o1.getRating()<o2.getRating())
			return -1;
		else
			return 0;
	}

}
