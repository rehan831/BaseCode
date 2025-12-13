package jaava8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class functionTest1 {

	public static void main(String[] args) {
		
		Function<String,Integer> function = x->x.length();
		Function<String,String> function1 = s->s.substring(0,3);
		System.out.println(function1.andThen(function).apply("rehan"));
		
	}

}
