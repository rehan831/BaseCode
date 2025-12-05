package jaava8;
import java.util.*;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList <>();
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
	System.out.println(list);
	Collections.sort(list,(a,b)-> b-a);
	System.out.println(list);
		

	}

}
