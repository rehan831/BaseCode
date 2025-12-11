package jaava8;
import java.util.function.Predicate;
public class PredicateTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<String> startWithLetterv = x-> x.toLowerCase().charAt(0)=='v';
		Predicate<String> endWithLetterl = x-> x.toLowerCase().charAt(x.length()-1)=='l';
		Predicate<String> and =startWithLetterv.and(endWithLetterl);
		System.out.println(and.test("vipul"));

	
	Predicate<String> startWithLetterv1 = x-> x.toLowerCase().charAt(0)=='v';
	Predicate<String> endWithLetterl1 = x-> x.toLowerCase().charAt(x.length()-1)=='l';
	Predicate<String> or =startWithLetterv.or(endWithLetterl);
	System.out.println(and.test("vipuz"));
	
	
	Predicate<String> startWithLetterv2 = x-> x.toLowerCase().charAt(0)=='v';
	Predicate<String> endWithLetterl2 = x-> x.toLowerCase().charAt(x.length()-1)=='l';
	//Predicate<String> egate =startWithLetterv.negate(endWithLetterl);
	System.out.println(startWithLetterv2.negate().test("ipul"));
	}

}
