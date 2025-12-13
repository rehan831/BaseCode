package jaava8;
import java.util.function.Consumer;

public class consumerTest1 {

	public static void main(String [] args) {
		
		 Consumer<String> c = s -> System.out.println(s);

	        c.accept("Hello Rehan");
		
	}
}
