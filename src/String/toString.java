package String;



public class toString {
	
		
	
	public static void main(String[]args) {
		String s = new String("Mohd Rehan");
		String s1 = new String("Baraktullah Ansari");
		
		System.out.println(s+" "+s1);
		student s2 = new student("durga",101);

		System.out.println(s2);
		
		
	}

}
class student{
	String name ;
	int age;
	
	student(String name,int age){
		this.name = name;
		this.age = age;
	}

	
}
