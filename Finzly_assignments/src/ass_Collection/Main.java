package ass_Collection;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	for(int i=0;i<2;i++) {
		System.out.println("enter the following "
				+ "1 : ArrayList "
				+ "2 : Vector "
				+ "3 : LinkedList "
				+ "4 : HashSet "
				+ "5 : TreeSet "
				+ "6 : LinkedHashSet ");
		Scanner sc=new Scanner(System.in);
		int ip=sc.nextInt();
		switch (ip) {
		
		case 1:
			ArrayList_ex a1=new ArrayList_ex();
			a1.operation_al();
			break;
		case 2:
			Vector_ex v1=new Vector_ex();
			v1.operation_vec();
			break;
		case 3:
			LinkedList_ex ll=new LinkedList_ex();
			ll.operation_ll();
			break;
		case 4:
			HashsSet_ex hs=new HashsSet_ex();
			hs.operation_hs();
			break;
		case 5: 
			TreeSet_ex ts=new TreeSet_ex();
			ts.operation_ts();
			break;
		case 6:
			LinkedHashSet_eg lhs=new LinkedHashSet_eg();
			lhs.operation_lhs();
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + ip);
		
		}
		
	}
	}
}
