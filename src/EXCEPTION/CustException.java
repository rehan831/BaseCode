package EXCEPTION;

public class CustException {
	
	public static void main(String[]args) {
		
		int age = Integer.parseInt(args[0]);
		if(age>60) {
			throw new TooYoungException("plz wait some more time you will get best match soon");
			
		}
		else if (age<18) {
			throw new TooOldException("your age crossed is marraiage age ..no chance of getting marriage");
			
		}
		else {
			System.out.println("you will get masg very soon in your gmail plz wait");
		}
	}
	

}
class TooYoungException extends RuntimeException{
	
	TooYoungException(String s){
		super(s);
	}
}
class TooOldException extends RuntimeException{
	
	TooOldException(String s){
		super(s);
	}
}
