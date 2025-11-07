package collection;
import java.util.concurrent.*;
public class ConcurrentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ConcurrentHashMap m = new ConcurrentHashMap();
		m.put(101,"Rehan");
		m.put(102,"durga");
		m.putIfAbsent(103,"affan");
		m.putIfAbsent(101,"Ansari");
		m.remove(101,"durga");
		m.replace(101,"Rehan","Rehaan");
		System.out.println(m);
	}

}
