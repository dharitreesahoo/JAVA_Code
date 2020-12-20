package samplePrograms;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class NoOfOccurenceOfCharInStr {

	public static void main(String[] args) {
		String str =  "dhartree";
		char[] arr = str.toCharArray();
		HashMap<Character , Integer> map =  new HashMap<Character , Integer>();
		for(char c:arr)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		
		}
        // Printing the charCountMap 
        for (Entry<Character, Integer> entry : map.entrySet()) { 
            System.out.println(entry.getKey() + ">>>>>" + entry.getValue()); 
        } 
		
		

	}

}
