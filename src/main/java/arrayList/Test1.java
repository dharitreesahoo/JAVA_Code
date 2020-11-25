package arrayList;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test1 {
	public static void swapNo(int a , int b)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println("*******");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		int a=10;
		int b=20;
		swapNo(10,20);
//		HashMap<String,String> hashMap  = new HashMap<String,String>();
//		hashMap.put("name1", "dhari");
//		hashMap.put("name2", "santoo");
//		hashMap.put("name2", "avee");
//		
//		Set<Entry<String, String>> mapVal = hashMap.entrySet();
//		for(Entry<String, String> val:mapVal)
//		{
//			System.out.println("Keys - "+val.getKey() + ","+"value - "+val.getValue());
//			
//		}
	

	}

}
