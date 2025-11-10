package collection;
import java.util.concurrent.*;
import java.util.Iterator;

public class cncurrentDemo {

	public static void main(String[] args) {
		
		CopyOnWriteArrayList l = new CopyOnWriteArrayList();
		l.add("A");
		l.add("B");
		l.add("c");
		Iterator itr = l.iterator();
		l.add("D");
		while(itr.hasNext()) {
			String s = (String)itr.next();
			System.out.println(s);
		}
		
	}

}
