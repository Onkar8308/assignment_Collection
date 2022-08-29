package ass_Collection;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSet_ex {
	 void operation_ts() {
			TreeSet<Integer> ts=new TreeSet<>();
			ts.add(100);
			ts.add(50);
			ts.add(99);
			ts.add(54);
			ts.add(60);
			ts.add(700);
			System.out.println("after adding the element in Treeset");   		   		   	//adding element
			System.out.println(ts);
			
			
			System.out.println("specify which element to remove");
			Scanner sc=new Scanner(System.in);
			int get=sc.nextInt();
			ts.remove(get);
			System.out.println("after removing the  element");								//removing one element
			System.out.println(ts);
			
			
			System.out.print("to check the 54 is present in  list : ");							//checking element is present or not
			boolean pre=ts.contains(54);
			System.out.println(pre);
			
			
			int a=ts.size();		
			System.out.println("size of TreeSet is : "+a);										//size of TresSet
			
			
			System.out.println("removing all element");
			ts.removeAll(ts);																	//removing all element
			
			System.out.print("checking the list is empty or not : ");
			boolean check=ts.isEmpty();
			System.out.println(check);															//checking set is empty or not
		}


}

