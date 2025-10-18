package WrapperClass;

public class Wrapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer i = Integer.valueOf(50);  //we can use valueof method to creat wrapper obj for the given 
		//primitive and string
		String s = String.valueOf("56");
		//that is string object
		
		System.out.println(i.intValue());//we can use xxxvalue() to get primitve  for the given wrapper obj
	int f = Integer.parseInt(s); //parsexx() we can use parsexxx method convert Sting to primitive type
		
		
		
		String Y = Integer.toString(50); //we can use tostring () to convert wrapper or primitibve to String
		System.out.println(Y);
		System.out.println(s);

	}

}
