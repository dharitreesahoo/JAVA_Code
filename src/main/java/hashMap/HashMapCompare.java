package hashMap;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapCompare {

	public static void main(String[] args) {
		HashMap<Integer,String> map1 =  new HashMap<Integer,String>();
		map1.put(1,"A");
		map1.put(2,"B");
		map1.put(3,"C");
		
		
		HashMap<Integer,String> map2 =  new HashMap<Integer,String>();
		map2.put(1,"A");
		map2.put(2,"B");
		map2.put(3,"D");
		//for duplicate keys map will not give error it will take the latest key and override
		map2.put(3,"C");
		System.out.println(map1);
		System.out.println(map2);
		//compare on the basis of key value**********
		System.out.println(map1.equals(map2));
		//compare basis of keys
		System.out.println(map1.keySet().equals(map2.keySet()));
		
		//find out extra keys**************
		
		HashMap<Integer,String> map4 =  new HashMap<Integer,String>();
		map4.put(1,"A");
		map4.put(2,"B");
		map4.put(3,"D");
		map4.put(4,"abc");
		
		//combine both map
		//set will conatin 1,2,3
		HashSet<Integer> set = new HashSet<Integer>(map2.keySet());
		System.out.println(".........."+set);
		//addes only 4 as 1 , 2 3  are duplicate and finally it ll be 1 ,2 ,3 4
		set.addAll(map4.keySet());
		System.out.println("........."+set);
		set.removeAll(map2.keySet());
		System.out.println("........."+set);
		
		
		

	}

}
