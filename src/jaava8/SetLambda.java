package jaava8;
import java.util.*;
public class SetLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> s = new TreeSet<>((a,b)->b-a);
		s.add(40);
		s.add(50);
		s.add(60);
		s.add(70);
		System.out.println("before manual sorting"+s);
		

	}

}
