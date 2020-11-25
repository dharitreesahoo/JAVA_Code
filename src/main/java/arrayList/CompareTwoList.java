package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareTwoList {

	public static void main(String[] args) {
		ArrayList<String> l1  = new ArrayList<String>(Arrays.asList("A","B","C","F"));
		ArrayList<String> l2  = new ArrayList<String>(Arrays.asList("B","A","C","G"));
		
		Collections.sort(l1);
		Collections.sort(l2);
		System.out.println(l1.equals(l2));
		//find additional element
		

	}

}
