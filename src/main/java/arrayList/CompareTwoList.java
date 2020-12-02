package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareTwoList {

	public static void main(String[] args) {
//		ArrayList<String> l1  = new ArrayList<String>(Arrays.asList("A","B","C","F"));
//		ArrayList<String> l2  = new ArrayList<String>(Arrays.asList("B","A","C","G"));
//		
//		Collections.sort(l1);
//		Collections.sort(l2);
//		System.out.println(l1.equals(l2));
		//find additional element
		ArrayList<String> l4  = new ArrayList<String>(Arrays.asList("A","B","C","F"));
		ArrayList<String> l5  = new ArrayList<String>(Arrays.asList("B","A","C","G"));
		/*l4.removeAll(l5);
		System.out.println(l4);*/
		l5.removeAll(l4);
		System.out.println(l5);
		//find common element
		ArrayList<String> l6 = new ArrayList<String>(Arrays.asList("java","c++","python","javascript"));
		ArrayList<String> l7  = new ArrayList<String>(Arrays.asList("java","c++","python","vbscript"));
		l6.retainAll(l7);
		System.out.println(l6);
	}

}
