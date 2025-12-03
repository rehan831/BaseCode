package jaava8;
import java.util.*;
import java.util.stream.*;

public class Evenlambda {
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l = new ArrayList();
		l.add(20);
		l.add(15);
		l.add(10);
		l.add(5);
		l.add(0);
		System.out.println(l);
		Comparator<Integer> c =(I1,I2)->(I1<I2)?-1:(I1>I2)?1:0;
		Collections.sort(l,c);
		System.out.println(l);
		//l.stream().forEach(System.out::println);

		List<Integer> l2 = l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l2);
	}

}

