package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {

	public static void main(String[] args) {
//		ArrayList<Integer> numbers  = new ArrayList<Integer>(Arrays.asList(1,2,3,3,4,4,5,6,7,7,8,8,9));
//		LinkedHashSet<Integer> 	linkedHashset = new LinkedHashSet<Integer>(numbers);
//		
//		//agan we need one more list to store unique values
//		ArrayList<Integer> uniqueVal  = new ArrayList<Integer>(linkedHashset);
//		System.out.println(uniqueVal);
		
		//2- jdk 8 way of solving
		ArrayList<Integer> numbers  = new ArrayList<Integer>(Arrays.asList(1,2,3,3,4,4,5,6,7,7,8,8,9));
		List<Object> uniqueNos = numbers.stream().distinct().collect(Collectors.toList());
		System.out.println(uniqueNos);
	}

}
