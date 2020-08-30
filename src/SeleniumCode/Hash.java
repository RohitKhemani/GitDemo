package SeleniumCode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hash {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		HashMap<Integer, String> hs = new HashMap<Integer, String>();
		
hs.put(1, "Jerry");
hs.put(2,"Tom");
hs.put(3, "Rohit");

 Set<Entry<Integer, String>> set = hs.entrySet();
 
 Iterator<Entry<Integer, String>> it = set.iterator();
 
 while(it.hasNext()){
	 
Map.Entry map =	(Map.Entry)it.next();
 
System.out.println(map.getValue());

 }
	}

}
