package Multithreading;

public class DaemonDemo extends Thread {
	
	public void run() {
		if(Thread.currentThread().isDaemon()){
			System.out.println("Daemon THreda");
		}
		System.out.println("child thread Threda");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main hraeda");
		
		DaemonDemo  d = new DaemonDemo();
		d.setDaemon(true);
		d.start();

	}

}
