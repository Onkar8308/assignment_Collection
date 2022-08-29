package ass_Collection;
import java.util.Vector;

 class Vector_ex {
	void operation_vec() {
		Vector<Integer> v=new Vector<>();
		v.add(100);
		v.add(50);
		v.add(99);
		v.add(54);
		v.add(60);
		v.add(700);
		System.out.println("after adding the element in vector");         //adding element
		System.out.println(v);
		
		
		System.out.println("after removing the 2nd element");					//removing one element
		v.remove(1);
		System.out.println(v);
		
		
		System.out.print("to check the 54 is present in  vector : ");				//checking element is present or not
		boolean pre=v.contains(54);
		System.out.println(pre);
		
		
		int a=v.size();
		System.out.println("size of vector is : "+a);						//size of Vector
		
		
		System.out.println("removing all element");
		v.removeAll(v);														//removing all element
		
		System.out.print("checking the vector is empty or not : ");
		boolean check=v.isEmpty();
		System.out.println(check);												//checking list is empty or not
		
		}

	}

