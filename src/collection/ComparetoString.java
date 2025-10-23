package collection;
import java.util.*;
public class ComparetoString {

	public static void main(String[] args) {
		
		TreeSet t = new TreeSet(new MyComparator1());
		t.add("roju");
		t.add("shobhalaxmi");
		t.add("rajakumari");
		t.add("gangabhavani");
		t.add("ramamulam");
		//t.add("mohd");
		System.out.println(t);
		// TODO Auto-generated method stub

	}
}
class MyComparator1 implements Comparator{
	public int compare(Object obj1,Object obj2) {
		String s1 = obj1.toString();
		String s2 = (String)obj2;
		
		
		
		
		return s2.compareTo(s1);
		
		
	}
}
