package collection;
import java.util.*;
public class practiceOfColllection {

	public static void main(String[] args) {
		Integer [] s = {10,20,30,50};
		System.out.println(s.length);
		List l = Arrays.asList(s);
		l.set(0,20);
		System.out.println(l);
		System.out.println(l.size());

	}

}
