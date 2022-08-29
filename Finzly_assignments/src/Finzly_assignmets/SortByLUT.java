package Finzly_assignmets;

import java.util.Comparator;

public class SortByLUT implements Comparator<Csv>{

	@Override
	public int compare(Csv o1, Csv o2) {
		// TODO Auto-generated method stub
		return o1.getLastUpdatedTime().compareTo(o2.getLastUpdatedTime());	
	}

}
