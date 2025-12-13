package jaava8;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class consumerTest2 {

	public static void main(String[] args) {
		Consumer<List<Integer>> listconsumer = li ->{
			
			for(Integer i : li) {
				System.out.println(i + 100);
			}
			
			
		};
		listconsumer.accept(Arrays.asList(1,2,3,4));

	}

}
