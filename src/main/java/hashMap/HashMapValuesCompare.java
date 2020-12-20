package hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapValuesCompare {
	public static void compareValues(Map<Integer, String> map1 , Map<Integer, String> map2)
	{
		boolean blnStatus = new ArrayList<>(map1.values()).equals(new ArrayList<>(map2.values()));
		System.out.println(blnStatus);
	}

	public static void main(String[] args) {
		Map<Integer , String> map1 = new HashMap<Integer , String>();
		map1.put(1, "A");
		map1.put(3, "B");
		map1.put(4, "C");
		Map<Integer , String> map2 = new HashMap<Integer , String>();
		map2.put(1, "A");
		map2.put(3, "B");
		map2.put(4, "C");
		compareValues(map1,map2);
		
}
}
