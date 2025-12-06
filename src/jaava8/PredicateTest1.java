package jaava8;
import java.util.function.*;

public class PredicateTest1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<Integer> salaryWith = x->x>10000;
		System.out.println(salaryWith.test(100000));
		

	}

}
