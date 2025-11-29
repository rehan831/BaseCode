package jaava8;

import java.util.function.*;

public class SqureDemo {

	public static void main(String[] args) {
		
		Function<Integer, Integer> Square = n -> n*n;
		System.out.println(Square.apply(5));

	}

}
