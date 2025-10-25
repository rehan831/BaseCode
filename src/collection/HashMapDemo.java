package collection;
import java.util.*;
public class HashMapDemo {
public static void main(String []args ) {
	
	HashMap h = new HashMap();
	h.put(102,"rehan ansari");
	h.put(500,"affan");
	h.put(541,"bhai");
	System.out.println(h);
	System.out.println(h.put(500,"ansari"));
	
	Set s = h.keySet();
	System.out.println(s);
	Collection c = h.values();
	System.out.println(c);
	Set s1 = h.entrySet();
	System.out.println(s1);
	
	Iterator itr = s1.iterator();
	while(itr.hasNext()) {
		
		Map.Entry m1 = (Map.Entry)itr.next();
	
	System.out.println(m1.getKey()+"   "+m1.getKey());
	
	if(m1.getKey().equals("500")) {
		m1.setValue(10000);
		System.out.println(m1);
	}
	
	
	}
	System.out.println(h);
}
}
