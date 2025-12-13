package jaava8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class functionTest2 {

	public static void main(String[] args) {
		Function<Integer,Integer> function1 = x-> 2*x;
		Function<Integer,Integer> function2 = x-> x*x*x;
		
		System.out.println(function1.andThen(function2).apply(3));
		
		System.out.println(function2.andThen(function1).apply(3));
		
		System.out.println(function2.compose(function1).apply(3));
		System.out.println(function1.compose(function2).apply(3));
		
		

	}

}
