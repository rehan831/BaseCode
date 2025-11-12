package Multithreading;

public class ThreadDemo implements Runnable {
	
	public void run() {
		
		System.out.println("music");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadDemo t = new ThreadDemo();
		Thread th = new Thread(t);
		th.start();
	}

}
