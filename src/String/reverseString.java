package String;

public class reverseString {

	public static void main(String[] args) {
		
		StringBuffer s = new StringBuffer("rehan");
		System.out.println(s.reverse());
	
		// TODO Auto-generated method stub
	
		StringBuffer s1 = new StringBuffer();
		System.out.println(s1.capacity());
		s1.ensureCapacity(1000);
		System.out.println(s1.capacity());
		System.out.println(s.capacity());
	}

}
