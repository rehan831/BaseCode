package Multithreading;

public class AliveMethodDemo extends Thread {
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println("Thread TAsk");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AliveMethodDemo t = new AliveMethodDemo();
		t.start();
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().isAlive());
				System.out.println(t.isAlive());

	}

}
