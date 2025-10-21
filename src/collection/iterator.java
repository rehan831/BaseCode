package collection;

import java.util.*;

public class iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList  l = new ArrayList();
		for(int i = 0; i <=10; i++) {
			l.add(i);
		}
		System.out.println(l);
		
		Iterator itr = l.iterator();
		while(itr.hasNext()) {
			// we can apply uterator curdor for any collection object and hence it is universal cursor
			// by using iterator we can perform both read and remove operation 
			// we can creat iterator object by using iterator method of collectuion intrface
			Integer I = (Integer)itr.next();
			if(I %2==0) 
				System.out.println(I);
			else
				itr.remove();
			
		}
		System.out.println(l);

	}

}
