package jaava8;

public class MyClass implements A,B{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		MyClass m = new MyClass();
		m.sayHello();

	}
	public void sayHello() {
	 System.out.println("hello");
	}

}
interface A{
	
	
	default void sayHello() {
		System.out.println("Assalamualikum warahmatullah");
	}
	
	
}
interface B{
	default void sayHello() {
		System.out.println("assalamualikum");
	}
	
}
