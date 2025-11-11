package Multithreading;

public class ThreadingDemo extends Thread{
	
	public void run() {
		
		
	}
	public int add(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {
		
		ThreadingDemo t = new ThreadingDemo();
		
		
		t.start();
		System.out.println(t.add(10,20));;;;;;;;;;;;;;;;;;;;;
	}

}
