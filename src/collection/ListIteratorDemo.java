package collection;
import java.util.*;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// by using listiteraotr we can move both either foward direction and backeard directoion a
		//and hence it is bidirectional cursor
		LinkedList l = new LinkedList();
		
		l.add("rehan");
		l.add("bhia");
		l.add("ansari");
		
		ListIterator itr = l.listIterator();
		while(itr.hasNext()) {
			String s = (String)itr.next();
			
			if(s.equals("rehan"));
			{
				itr.remove();
			}
			System.out.println(l);
		}
		

	}

}
