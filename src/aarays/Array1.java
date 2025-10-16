package aarays;

public class Array1 {
	
public static void main(String[] args) {
	int [] numerators = {10,200,30,40};
	int [] denominators = {1,2,0,3};
	 
	
	for (int i = 0; i< numerators.length; i++) {
		
		System.out.println(divide(numerators[i], denominators[i]));

	}
	
	
	
	System.out.println("good job Rehan bhai");

}


public static int divide(int a , int b) {
	try {
return a/b;
	}
	catch(Exception e) {
		System.out.println(e);
		return -1;
	}
}
}