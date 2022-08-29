package ass_Collection;

import java.util.HashSet;
import java.util.Scanner;

 class HashsSet_ex {
	 void operation_hs() {
			HashSet<Integer> hs=new HashSet<>();
			hs.add(100);
			hs.add(50);
			hs.add(99);
			hs.add(54);
			hs.add(60);
			hs.add(700);
			System.out.println("after adding the element in HashSet");	   		      			  //adding element
			System.out.println(hs);
				
			System.out.println("entwe the element to remove");
			Scanner sc=new Scanner(System.in);
			int get=sc.nextInt();
			System.out.println("after removing the element");									//removing one element
			hs.remove(get);
			System.out.println(hs);
			
			
			System.out.print("to check the 54 is present in  set : ");							//checking element is present or not
			boolean pre=hs.contains(54);
			System.out.println(pre);
			
			
			int a=hs.size();		
			System.out.println("size of HashSet is : "+a);										//size of HashSet
			
			
			System.out.println("removing all element");
			hs.removeAll(hs);																	//removing all element
			
			System.out.print("checking the set is empty or not : ");
			boolean check=hs.isEmpty();
			System.out.println(check);															//checking set is empty or not
		}


}
