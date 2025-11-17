package Multithreading;

public class joinDemo extends Thread {
	
	public void run() {
		try {
			for(int i = 1; i<=5;i++) {
				System.out.println(i);
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		joinDemo d = new joinDemo();
		d.start();
		d.join();
		try {
			for(int i = 1; i <=5; i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		
	}

}
