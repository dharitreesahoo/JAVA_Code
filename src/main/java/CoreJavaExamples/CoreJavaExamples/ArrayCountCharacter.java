package CoreJavaExamples.CoreJavaExamples;

import java.util.ArrayList;
import java.util.ArrayList.*;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ArrayCountCharacter {

	static List addArray(int[]... inputArrays) {
		List lst = new ArrayList();
		for (int[] inputArray : inputArrays) {
			// System.out.println(Arrays.toString(inputArray));

			for (int i : inputArray) {
				lst.add(i);
			}
		}
		//System.out.println(lst);
		return lst;
	}

	public static void occurenceCharacter(List lst) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < lst.size(); i++) {
			if (map.containsKey(lst.get(i))) {
				map.put((Integer) lst.get(i), map.get(lst.get(i)) + 1);
			} else {
				map.put((Integer) lst.get(i), 1);
			}
		}
		
		for(Entry<Integer, Integer> ele:map.entrySet())
		{
			System.out.println(ele.getKey()+" "+ ele.getValue());
		}
	}

	public static void main(String[] args) {

		int arr1[] = { 2, 4, 5, 6, 7, 7, 7,7 };
		int arr2[] = { 2, 4, 5, 6, 7, 7, 7 };
		int arr3[] = { 2, 4, 5, 6, 7, 7, 7,7,7,8,9 };
		List lst = addArray(arr1, arr2,arr3);
		occurenceCharacter(lst);

	}

}
