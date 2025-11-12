package Multithreading;

public class SingleDemo extends Thread{
	
public void run() {
	System.out.println("video playing ");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleDemo t = new SingleDemo();
		t.start();
		SingleDemo t1 = new SingleDemo();
        t1.start();
	}

}
