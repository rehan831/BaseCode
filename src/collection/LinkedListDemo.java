package collection;
import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(50);
		l.add("rehan");
		l.add("ansari");
		l.add(1,"mohd");
		l.add("barakatullah");
		//l.set(0,"Mr");
		System.out.println(l);
		l.removeLast();
		l.removeFirst();
		l.addFirst("bhau");
		System.out.println(l);
		
	}

}
