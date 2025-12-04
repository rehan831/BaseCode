package jaava8;
import java.util.*;

public class ListLambda {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(40);
		list.add(80);
		list.add(70);
		list.add(60);
		Collections.sort(list, (a,b)->b-a);
		System.out.println(list);
	}

}
