package hashMap;

import java.util.HashMap;

public class HashMapSample {

	public static void main(String[] args) {
		HashMap<String,String> capitalMap = new HashMap<String,String>();
		capitalMap.put("India","Delhi");
		capitalMap.put("USA","Washington");
		capitalMap.put("UK","London");
		capitalMap.forEach((k,v) -> System.out.println("key"+k+" value"+v));
		

	}

}
