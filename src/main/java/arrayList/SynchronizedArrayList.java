package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {
		//1 - Collections.synchronizedList
		
		List<String> namesList = Collections.synchronizedList(new ArrayList<String>());
		namesList.add("java");
		namesList.add("ruby");
		namesList.add("python");
		namesList.add("php");

		synchronized (namesList) {
			Iterator<String> it = namesList.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
		}
		
		//2- copy CopyOnWriteArrayList
		
	CopyOnWriteArrayList<String> emplIst = new CopyOnWriteArrayList<String>();
	emplIst.add("dhari");
	emplIst.add("santoo");
	emplIst.add("avneesh");
	
	Iterator<String> it = emplIst.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}

	}

}
