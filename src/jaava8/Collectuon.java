package jaava8;
import java.util.*;

class TestDemo implements Comparator <Integer> {
	public int compare(Integer I1, Integer I2) {
		return (I1<I2)?-1:(I1>I2)?1:0;
		
	}
	
}
	
public	class  Collectuon{

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList();
		l.add(20);
		l.add(15);
		l.add(10);
		l.add(5);
		l.add(0);
		System.out.println(l);
		Collections.sort(l,new TestDemo());
		System.out.println(l);
		

	}

}
