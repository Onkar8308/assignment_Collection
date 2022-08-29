package ass_Collection;
import java.util.ArrayList;

 class ArrayList_ex {
	 void operation_al() {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(100);
		al.add(50);
		al.add(99);
		al.add(54);
		al.add(60);
		al.add(700);
		System.out.println("after adding the element in arrraylist");         //adding element
		System.out.println(al);
		
		System.out.println("after removing the 3rd element");					//removing one element
		al.remove(2);
		System.out.println(al);
		
		
		System.out.print("to check the 54 is present in  list : ");				//checking element is present or not
		boolean pre=al.contains(54);
		System.out.println(pre);
		
		
		int a=al.size();
		System.out.println("size of arraylist is : "+a);						//size of ArrayList
		
		
		System.out.println("removing all element");
		al.removeAll(al);														//removing all element
		
		System.out.print("checking the list is empty or not : ");
		boolean check=al.isEmpty();
		System.out.println(check);												//checking list is empty or not
	}
		
}	
