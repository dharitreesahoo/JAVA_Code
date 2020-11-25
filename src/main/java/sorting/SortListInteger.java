package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortListInteger {

	public static void main(String[] args) {
		ArrayList<Integer> integerList  = new ArrayList<Integer>(Arrays.asList(2,3,4,5,7,1,9,3,3));
		for(Integer  temp:integerList)
		{
			System.out.println(temp);
		}
		Collections.sort(integerList);
		for(Integer  temp:integerList)
		{
			System.out.println(temp);
		}

	}

}
