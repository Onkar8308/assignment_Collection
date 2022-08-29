package ass_Collection;
import java.util.LinkedHashSet;
import java.util.Scanner;
 class LinkedHashSet_eg {
	void operation_lhs() {
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
		lhs.add(100);
		lhs.add(50);
		lhs.add(99);
		lhs.add(54);
		lhs.add(60);
		lhs.add(700);
		System.out.println("after adding the element in LinkedHashSet");   		   		   	//adding element
		System.out.println(lhs);
		
		
		System.out.println("enter the element to remove");
		Scanner sc=new Scanner(System.in);
		int get=sc.nextInt();
		System.out.println("after removing the last element");								//removing one element
		lhs.remove(get);
		System.out.println(lhs);
			
		
		
		System.out.print("to check the 54 is present in  set : ");							//checking element is present or not
		boolean pre=lhs.contains(54);
		System.out.println(pre);
		
		
		int a=lhs.size();		
		System.out.println("size of LinkedHaslhset is : "+a);										//size of linkedHashSet
		
		
		System.out.println("removing all element");
		lhs.removeAll(lhs);																	//removing all element
		
		System.out.print("checking the list is empty or not : ");
		boolean check=lhs.isEmpty();
		System.out.println(check);															//checking set is empty or not
	}


}
