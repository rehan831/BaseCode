package collection;

import java.util.*;

public class CompratorDemo {

	public static void main(String[] args) {
		
		TreeSet set = new TreeSet(new MyComprator());
		set.add(10);
		set.add(20);
		set.add(5);
		set.add(0);
		set.add(3);
		set.add(3);
		System.out.println(set);
		// TODO Auto-generated method stub

	}

}
class MyComprator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Integer I1 = (Integer) o1;
		Integer I2 = (Integer) o2;
		if(I1<I2)
			return +1;
		else if(I1>I2)
			return -1;
		else
		
		return 0;
	}
	
}
