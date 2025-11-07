package collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.*;

public class ConcurentDemo2 extends Thread {
	static ConcurrentHashMap m = new ConcurrentHashMap();
	public void run() {
		
		try {Thread.sleep(2000);}
		catch(InterruptedException e) {
			
		}
		m.put(103,"c");
		System.out.println("child thersd updationg map");
		}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		m.put(101,"A");
		m.put(102,"B");
		
		ConcurentDemo2 t = new ConcurentDemo2();
		t.start();
		Set s1 = m.keySet();
       Iterator itr = s1.iterator();
       while(itr.hasNext()) {
    	   Integer I1 = (Integer) itr.next();
    	   System.out.println("main therad iteraring map and current entry is "
    	   		+ ""
    	   		+ I1+"..."+m.get(I1));
    	   Thread.sleep(3000) ;
       }

System.out.println(m);
	}

}
