package jaava8;
import java.util.*;
public class LambdaExpression {

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

	}

}
