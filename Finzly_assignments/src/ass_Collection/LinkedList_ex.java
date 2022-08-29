package ass_Collection;
import java.util.LinkedList;

public class LinkedList_ex {
	 void operation_ll() {
		 	LinkedList<Integer> ll=new LinkedList<>();
		 	ll.add(100);
			ll.add(50);
			ll.add(99);
			ll.add(54);
			ll.add(60);
			ll.add(700);
			System.out.println("after adding the element in linkedlist");         //adding element
			System.out.println(ll);
			
			
			System.out.println("after removing the 3rd element");							//removing one element
			ll.remove(2);
			System.out.println(ll);
			
			
			System.out.print("to check the 54 is present in  linkedlist : ");				//checking element is present or not
			boolean pre=ll.contains(54);
			System.out.println(pre);
			
			
			int a=ll.size();
			System.out.println("size of linkedlist is : "+a);								//size of LinkedList
			
			

			System.out.println("removing all element : "+ll.removeAll(ll));					//removing all element
			
			System.out.print("checking the linkedlist is empty or not : ");
			boolean check=ll.isEmpty();
			System.out.println(check);														//checking list is empty or not
		}


}
