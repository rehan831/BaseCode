package Multithreading;

public class MultipleDemo extends Thread {
	public void run() {
		
		System.out.println("video playing");
	}
		public static void main(String[] args) {
		
		MultipleDemo t = new MultipleDemo();
		t.start();
		
		//MultipleDemo t1 = new MultipleDemo();
		//t1.start();
		// TODO Auto-generated method stub
		Rehan re = new Rehan();
		re.start();
		
		Music1 r1 = new Music1();
		r1.start();

	}

}
class Rehan extends Thread{
	public void run() {
		System.out.println("music");
	}
}
class Music1 extends Thread{
	public void run() {
		System.out.println("progress");
	}
}
