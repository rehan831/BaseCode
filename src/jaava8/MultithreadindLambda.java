package jaava8;

public class MultithreadindLambda {

	public static void main(String[] args) {
		
		Runnable ru = ()-> {
			for(int i =0; i < 10; i++) {
				System.out.println("Rehan" + i);
			}
		};
		Thread thred = new Thread(ru);
		thred.start();
		

	}

}
