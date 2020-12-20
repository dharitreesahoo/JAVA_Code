package samplePrograms;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class NoOfOccurenceOfStringInSentence {

	public static void main(String[] args) {
		String str= "dharitree sahoo sahoo dharitree santosh";
		HashMap<String ,Integer> map = new HashMap<String ,Integer>();
		
		 String[] arr = str.split(" ");
		for(String ele:arr)
		{
			if(map.containsKey(ele))
			{
				map.put(ele, map.get(ele)+1);
			}
			else{
				map.put(ele, 1);
			}
		}
		
		Set<Entry<String, Integer>> set = map.entrySet();
		for(Entry<String, Integer> ele:set)
		{
			System.out.println(ele.getKey()+">>>>>>>>>>>>"+ele.getValue());
		}

	}

}
