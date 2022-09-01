package Collection_assignment.Test;

import java.io.IOException;

import java.util.Scanner;
import Collection_assignment.ReadFile;
import Collection_assignment.assignment1.SearchByPair;
import Collection_assignment.assignment2.SortByPair;
import Collection_assignment.assignment3.SortByLastUpdatedTime;

public class Test {
	
	public static void main(String[] args) throws IOException {
		ReadFile get=new ReadFile();
		int flag=1;
		Scanner sc=new Scanner(System.in);
		
		while(flag==1) {
			System.out.println("\nenter your choice\n"
					+ "1:search by currencyPair\n"
					+ "2:sort by currencyPairs\n"
					+ "3:sort by lastUpdateTime");
			int choice=sc.nextInt();
			switch (choice) {
				case 1: 
					SearchByPair search = new SearchByPair();
					search.searching();
					break;
					
				case 2:
					SortByPair sort = new SortByPair();
					sort.SortBypair();
					break;
					
				case 3:
					SortByLastUpdatedTime sbt = new SortByLastUpdatedTime();
					sbt.sortbytime();
					break;
					
				default:
					throw new IllegalArgumentException("Unexpected value: " + get);
			}
			
			System.out.println("1 : Continue\n"
							+ "2 : exit\n");
			flag = sc.nextInt();
			
		}
		sc.close();
	}

	
}
