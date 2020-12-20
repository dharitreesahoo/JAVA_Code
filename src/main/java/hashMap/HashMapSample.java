package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapSample {

	public static void main(String[] args) {
		HashMap<String,String> capitalMap = new HashMap<String,String>();
		capitalMap.put("India","Delhi");
		capitalMap.put("USA","Washington");
		capitalMap.put("UK","London");
		
		Iterator<String> it = capitalMap.keySet().iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			String val = capitalMap.get(key);
			System.out.println("key is "+key +"  -  value is "+val);
			
		}
		System.out.println("************************");
		Iterator<Entry<String, String>> it1 = capitalMap.entrySet().iterator();
		while (it1.hasNext()) {
			Entry<String, String> entry = it1.next();
					System.out.println("key"+entry.getKey()+"&&&&"+entry.getValue());
			
		}
		System.out.println("************************");
		capitalMap.forEach((key1,val1) -> System.out.println("key "+key1+"-  value "+val1));
		

	}

}
