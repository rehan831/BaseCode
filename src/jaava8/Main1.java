package jaava8;
import java.util.*;
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Vipul",256);
		Student s2 = new Student("bipul",2563);
		Student s3 = new Student("cipul",2564);
		Student s4 = new Student("aipul",255);
		List<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		Collections.sort(list,(a,b)->a.Id-b.Id);
		System.out.println(list);


	}

}
class Student{
	public String name ;
	
	public int Id;
	
	Student(String name,int Id){
		
		this.name=name;
		this.Id=Id;
		
	}
	public String toString() {
		return this.name +":"+this.Id;
	}
}
