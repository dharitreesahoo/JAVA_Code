package sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortListString {
	public static <T>void display(ArrayList<T> lst)
	{
		for(T  temp:lst)
		{
			System.out.println(temp);
		}
	}
	public static void main(String[] args) {
		ArrayList<String> stringList  = new ArrayList<String>(Arrays.asList("avneesh","santoo","dhari","koka"));
		display(stringList);
		System.out.println("***********");
		Collections.sort(stringList);
		display(stringList);
	}
}
