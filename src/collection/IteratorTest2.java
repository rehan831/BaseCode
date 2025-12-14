package collection;
import java.util.*;

public class IteratorTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l = new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(35);
		l.add(50);
		l.add(60);
		System.out.println("original list"+l);
		
			
		
		
		Iterator<Integer> itr = l.iterator();
		while(itr.hasNext()) {
			
			Integer v = (Integer)itr.next();
			if(v % 2 == 0) 
				System.out.println(v);
				else 
				itr.remove();
				
			
		}
		System.out.println(l);
	
	}

}
